package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Properties;


public class TabletPCCreator implements Command {

    @Override
    public Appliance create(Properties properties) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Integer.parseInt(properties.getProperty(
                SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())));
        tabletPC.setDisplayInches(Integer.parseInt(properties.getProperty(
                SearchCriteria.TabletPC.DISPLAY_INCHES.toString())));
        tabletPC.setMemoryROM(Integer.parseInt(properties.getProperty(
                SearchCriteria.TabletPC.MEMORY_ROM.toString())));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt(properties.getProperty(
                SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())));
        tabletPC.setColor(properties.getProperty(
                SearchCriteria.TabletPC.COLOR.toString()));
        return tabletPC;

    }
}
