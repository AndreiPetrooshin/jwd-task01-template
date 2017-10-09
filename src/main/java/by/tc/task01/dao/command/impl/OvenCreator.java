package by.tc.task01.dao.command.impl;


import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Properties;

public class OvenCreator implements Command {


    @Override
    public Appliance create(Properties properties) {
        Oven oven = new Oven();
        oven.setPowerConsumption(Integer.parseInt(properties.getProperty(
                SearchCriteria.Oven.POWER_CONSUMPTION.toString())));
        oven.setWeight(Integer.parseInt(properties.getProperty(
                SearchCriteria.Oven.WEIGHT.toString())));
        oven.setCapacity(Integer.parseInt(properties.getProperty(
                SearchCriteria.Oven.CAPACITY.toString())));
        oven.setDepth(Integer.parseInt(properties.getProperty(
                SearchCriteria.Oven.DEPTH.toString())));
        oven.setHeight(Double.parseDouble(properties.getProperty(
                SearchCriteria.Oven.DEPTH.toString())));
        oven.setWidth(Double.parseDouble(properties.getProperty(
                SearchCriteria.Oven.WIDTH.toString())));
        return oven;
    }
}
