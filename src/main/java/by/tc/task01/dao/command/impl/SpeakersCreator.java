package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Properties;

public class SpeakersCreator implements Command {

    @Override
    public Appliance create(Properties properties) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Integer.parseInt(properties.getProperty(
                SearchCriteria.Speakers.POWER_CONSUMPTION.toString())));
        speakers.setNumberOfSpeakers(Integer.parseInt(properties.getProperty(
                SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())));
        speakers.setFrequencyRange(properties.getProperty(
                SearchCriteria.Speakers.FREQUENCY_RANGE.toString()));
        speakers.setCordLength(Integer.parseInt(properties.getProperty(
                SearchCriteria.Speakers.CORD_LENGTH.toString())));
        return speakers;

    }
}
