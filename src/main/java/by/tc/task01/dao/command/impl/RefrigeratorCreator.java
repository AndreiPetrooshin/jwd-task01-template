package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Properties;

public class RefrigeratorCreator implements Command {

    @Override
    public Appliance create(Properties properties) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())));
        refrigerator.setWeight(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.WEIGHT.toString())));
        refrigerator.setFreezerCapacity(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())));
        refrigerator.setOverallCapacity(Double.parseDouble(properties.getProperty(
                SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())));
        refrigerator.setHeight(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.HEIGHT.toString())));
        refrigerator.setWidth(Integer.parseInt(properties.getProperty(
                SearchCriteria.Refrigerator.WIDTH.toString())));
        return refrigerator;
    }
}
