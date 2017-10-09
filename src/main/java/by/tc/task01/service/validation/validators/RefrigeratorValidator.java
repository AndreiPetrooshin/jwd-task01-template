package by.tc.task01.service.validation.validators;

import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;

import java.util.Map;


public class RefrigeratorValidator implements ValidatorAppliance {
    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(Refrigerator.POWER_CONSUMPTION)) {
                double power = Double.parseDouble(criteria.get(Refrigerator.POWER_CONSUMPTION).toString());
            }
            if(criteria.containsKey(Refrigerator.WEIGHT)) {
                double weight =  Double.parseDouble(criteria.get(Refrigerator.WEIGHT).toString());
            }
            if(criteria.containsKey(Refrigerator.FREEZER_CAPACITY)) {
                double freezer = Double.parseDouble(criteria.get(Refrigerator.FREEZER_CAPACITY).toString());
            }
            if(criteria.containsKey(Refrigerator.OVERALL_CAPACITY)) {
                double overallCapacity = Double.parseDouble(criteria.get(Refrigerator.OVERALL_CAPACITY).toString());
            }
            if(criteria.containsKey(Refrigerator.HEIGHT)) {
                double height = Double.parseDouble(criteria.get(Refrigerator.HEIGHT).toString());
            }
            if(criteria.containsKey(Refrigerator.WIDTH)) {
                double width = Double.parseDouble(criteria.get(Refrigerator.WIDTH).toString());
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
