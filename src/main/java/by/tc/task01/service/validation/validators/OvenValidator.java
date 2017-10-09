package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import java.util.Map;


public class OvenValidator implements ValidatorAppliance {

    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(Oven.POWER_CONSUMPTION)) {
                int power = (int) criteria.get(Oven.POWER_CONSUMPTION);
            }
            if(criteria.containsKey(Oven.WEIGHT)) {
                int weight =  (int)criteria.get(Oven.WEIGHT);
            }
            if(criteria.containsKey(Oven.CAPACITY)) {
                int capacity = (int) criteria.get(Oven.CAPACITY);
            }
            if(criteria.containsKey(Oven.DEPTH)) {
                int depth = (int) criteria.get(Oven.DEPTH);
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
