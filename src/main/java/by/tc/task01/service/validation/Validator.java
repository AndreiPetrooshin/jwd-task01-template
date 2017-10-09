package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.validators.ValidatorAppliance;

import java.util.Map;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        Map<E, Object> map = criteria.getCriteria();
        ValidatorAppliance validator = null;
        if (criteria.getApplianceType() != null) {
            validator = ValidatorFactory.validator(criteria.getApplianceType());
        }
        return validator != null && validator.validate(map);
    }

}
