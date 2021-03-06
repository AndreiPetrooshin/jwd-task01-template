package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.command.ApplianceDirector;
import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;


public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public <E> Appliance find(Criteria<E> criteria) {

        String filePath = "src\\main\\resources\\appliances_db.txt";
        ApplianceDirector applianceDirector = new ApplianceDirector();

        try (BufferedReader reader = getReader(filePath)) {

            String correctString = getCorrectString(reader, criteria);
            Properties properties = getProperties(correctString);
            String applianceName = criteria.getApplianceType();
            if (properties != null && applianceName != null) {
                Command command = applianceDirector.getCommand(applianceName);
                return command.create(properties);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private BufferedReader getReader(String filePath) throws FileNotFoundException {
        return new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
    }

    private boolean checkRange(String str, double value) {
        String sub = str.split(SearchCriteria.Speakers.FREQUENCY_RANGE.toString() + '=')[1];
        int index = sub.indexOf(",");
        String[] numbers = sub.substring(0, index).split("-");
        if (numbers.length > 1) {
            double first = Double.parseDouble(numbers[0]), second = Double.parseDouble(numbers[1]);
            return first <= value && value <= second;
        } else {
            return Double.parseDouble(numbers[0]) == value;
        }

    }

    private <E> boolean checkStringForConformity(Map.Entry<E, Object> entry, String temp) {
        Pattern p = Pattern.compile("(?i)" + entry.getKey().toString() + '=' + entry.getValue().toString() + "[,; ]");
        return p.matcher(temp).find();
    }

    private <E> String getCorrectString(BufferedReader reader, Criteria<E> criteria) throws IOException {
        Map<E, Object> hashMap = criteria.getCriteria();
        if ((hashMap.isEmpty() || reader == null)) {
            return null;
        }
        String temp;
        while (reader.ready()) {
            temp = reader.readLine();
            int count = 0;
            for (Map.Entry<E, Object> entry : hashMap.entrySet()) {
                String applianceName = entry.getKey().getClass().getSimpleName();
                if (!temp.contains(applianceName)) {
                    break;
                } else if (SearchCriteria.Speakers.FREQUENCY_RANGE.equals(entry.getKey())
                        && temp.contains(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())
                        && checkRange(temp, Double.parseDouble(entry.getValue().toString()))) {
                    count++;
                } else if (checkStringForConformity(entry, temp)) {
                    count++;
                } else {
                    break;
                }
                if (count == hashMap.size()) {
                    return temp;
                }
            }
        }
        return null;
    }

    private Properties getProperties(String str) throws IOException {
        if (str == null) {
            return null;
        }
        String toProps = str.split(":")[1].trim().replaceAll(",|;", "").replaceAll(" ", "\n");
        Properties properties = new Properties();
        ByteArrayInputStream builder = new ByteArrayInputStream(toProps.getBytes());
        properties.load(builder);
        return properties;
    }
}

