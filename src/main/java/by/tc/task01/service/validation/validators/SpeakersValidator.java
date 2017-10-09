package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.Speakers;

import java.util.Map;

public class SpeakersValidator implements ValidatorAppliance {

    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if (criteria.containsKey(Speakers.POWER_CONSUMPTION)) {
                int power = (int) criteria.get(Speakers.POWER_CONSUMPTION);
            }
            if (criteria.containsKey(Speakers.NUMBER_OF_SPEAKERS)) {
                int numberOfSpeakers = (int) criteria.get(Speakers.NUMBER_OF_SPEAKERS);
            }
            if (criteria.containsKey(Speakers.FREQUENCY_RANGE)) {
                Double frequencyRange = Double.parseDouble(criteria.get(Speakers.FREQUENCY_RANGE).toString());
            }
            if (criteria.containsKey(Speakers.CORD_LENGTH)) {
                int cordLength = (int) criteria.get(Speakers.CORD_LENGTH);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
