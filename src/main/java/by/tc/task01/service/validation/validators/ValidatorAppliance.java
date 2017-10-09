package by.tc.task01.service.validation.validators;

import java.util.Map;


public interface ValidatorAppliance {

   <E> boolean validate(Map<E, Object> criteria);

}
