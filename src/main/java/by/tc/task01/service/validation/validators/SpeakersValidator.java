package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.Speakers;

import java.util.Map;

public class SpeakersValidator implements ValidatorAppliance {

    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if (criteria.containsKey(Speakers.POWER_CONSUMPTION)) {
                double power = Double.parseDouble(criteria.get(Speakers.POWER_CONSUMPTION).toString());
            }
            if (criteria.containsKey(Speakers.NUMBER_OF_SPEAKERS)) {
                double numberOfSpeakers = Double.parseDouble(criteria.get(Speakers.NUMBER_OF_SPEAKERS).toString());
            }
            if (criteria.containsKey(Speakers.FREQUENCY_RANGE)) {
                double frequencyRange = Double.parseDouble(criteria.get(Speakers.FREQUENCY_RANGE).toString());
            }
            if (criteria.containsKey(Speakers.CORD_LENGTH)) {
                double cordLength = Double.parseDouble(criteria.get(Speakers.CORD_LENGTH).toString());
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
