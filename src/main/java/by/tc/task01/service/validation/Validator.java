package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.validators.ValidatorAppliance;

import java.util.Map;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        Map<E, Object> map = criteria.getCriteria();
        String applianceName = "";
        for (Map.Entry<E, Object> entry : map.entrySet()) {
            applianceName = entry.getKey().getClass().getSimpleName();
            break;
        }
        ValidatorAppliance validator = ValidatorFactory.validator(applianceName);
        return validator != null && validator.validate(map);
    }

}
