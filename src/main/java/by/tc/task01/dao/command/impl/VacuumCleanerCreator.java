package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Properties;

public class VacuumCleanerCreator implements Command {

    @Override
    public Appliance create(Properties properties) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Integer.parseInt(properties.getProperty(
                SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())));
        vacuumCleaner.setFilterType(properties.getProperty(
                SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()));
        vacuumCleaner.setBagType(properties.getProperty(
                SearchCriteria.VacuumCleaner.BAG_TYPE.toString()));
        vacuumCleaner.setWandType(properties.getProperty(
                SearchCriteria.VacuumCleaner.WAND_TYPE.toString()));
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(properties.getProperty(
                SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(properties.getProperty(
                SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())));
        return vacuumCleaner;
    }
}
