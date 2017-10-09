package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import java.util.Map;


public class LaptopValidator implements ValidatorAppliance {


    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(Laptop.BATTERY_CAPACITY)) {
                double battery = Double.parseDouble(criteria.get(Laptop.BATTERY_CAPACITY).toString());
            }
            if(criteria.containsKey(Laptop.OS)) {
                String os = (String) criteria.get(Laptop.OS);
            }
            if(criteria.containsKey(Laptop.MEMORY_ROM)) {
                int memory = (int) criteria.get(Laptop.MEMORY_ROM);
            }
            if(criteria.containsKey(Laptop.SYSTEM_MEMORY)) {
                int sysMemory = (int) criteria.get(Laptop.SYSTEM_MEMORY);
            }
            if(criteria.containsKey(Laptop.CPU)) {
                double cpu = Double.parseDouble(criteria.get(Laptop.CPU).toString());
            }
            if(criteria.containsKey(Laptop.DISPLAY_INCHS)) {
                int display = (int) criteria.get(Laptop.DISPLAY_INCHS);
            }
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
