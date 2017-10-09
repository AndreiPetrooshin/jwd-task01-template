package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import java.util.Map;


public class OvenValidator implements ValidatorAppliance {

    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(Oven.POWER_CONSUMPTION)) {
                double power = Double.parseDouble(criteria.get(Oven.POWER_CONSUMPTION).toString());
            }
            if(criteria.containsKey(Oven.WEIGHT)) {
                double weight = Double.parseDouble(criteria.get(Oven.WEIGHT).toString());
            }
            if(criteria.containsKey(Oven.CAPACITY)) {
                double capacity = Double.parseDouble(criteria.get(Oven.CAPACITY).toString());
            }
            if(criteria.containsKey(Oven.DEPTH)) {
                double depth = Double.parseDouble(criteria.get(Oven.DEPTH).toString());
            }
            if(criteria.containsKey(Oven.HEIGHT)) {
                double height = Double.parseDouble(criteria.get(Oven.HEIGHT).toString());
            }
            if(criteria.containsKey(Oven.WIDTH)) {
                double width = Double.parseDouble(criteria.get(Oven.WIDTH).toString());
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
