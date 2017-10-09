package by.tc.task01.service.validation.validators;

import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;

import java.util.Map;


public class RefrigeratorValidator implements ValidatorAppliance {
    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(Refrigerator.POWER_CONSUMPTION)) {
                int power = (int) criteria.get(Refrigerator.POWER_CONSUMPTION);
            }
            if(criteria.containsKey(Refrigerator.WEIGHT)) {
                int weight =  (int)criteria.get(Refrigerator.WEIGHT);
            }
            if(criteria.containsKey(Refrigerator.FREEZER_CAPACITY)) {
                int freezer = (int) criteria.get(Refrigerator.FREEZER_CAPACITY);
            }
            if(criteria.containsKey(Refrigerator.OVERALL_CAPACITY)) {
                double overallCapacity = Double.parseDouble(criteria.get(Refrigerator.OVERALL_CAPACITY).toString());
            }
            if(criteria.containsKey(Refrigerator.HEIGHT)) {
                int height = (int)criteria.get(Refrigerator.HEIGHT);
            }
            if(criteria.containsKey(Refrigerator.WIDTH)) {
                int width = (int)criteria.get(Refrigerator.WIDTH);
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
