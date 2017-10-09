package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Properties;


public class LaptopCreator implements Command {

    @Override
    public Appliance create(Properties properties) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Double.parseDouble(properties.getProperty(
                SearchCriteria.Laptop.BATTERY_CAPACITY.toString())));
        laptop.setOs(properties.getProperty(SearchCriteria.Laptop.OS.toString()));
        laptop.setMemoryROM(Integer.parseInt(properties.getProperty(
                SearchCriteria.Laptop.MEMORY_ROM.toString())));
        laptop.setSystemMemory(Integer.parseInt(properties.getProperty(
                SearchCriteria.Laptop.SYSTEM_MEMORY.toString())));
        laptop.setCpu(Double.parseDouble(properties.getProperty(
                SearchCriteria.Laptop.CPU.toString())));
        laptop.setDisplayInchs(Integer.parseInt(properties.getProperty(
                SearchCriteria.Laptop.DISPLAY_INCHS.toString())));
        return laptop;
    }
}
