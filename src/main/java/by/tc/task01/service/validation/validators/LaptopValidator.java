package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import java.util.Map;


public class LaptopValidator implements ValidatorAppliance {


    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(Laptop.BATTERY_CAPACITY)) {
                double battery = Double.parseDouble(criteria.get(Laptop.BATTERY_CAPACITY).toString());
            }
            if(criteria.containsKey(Laptop.OS)) {
                String os = (String) criteria.get(Laptop.OS);
            }
            if(criteria.containsKey(Laptop.MEMORY_ROM)) {
                double memory = Double.parseDouble(criteria.get(Laptop.MEMORY_ROM).toString());
            }
            if(criteria.containsKey(Laptop.SYSTEM_MEMORY)) {
                double sysMemory = Double.parseDouble(criteria.get(Laptop.SYSTEM_MEMORY).toString());
            }
            if(criteria.containsKey(Laptop.CPU)) {
                double cpu = Double.parseDouble(criteria.get(Laptop.CPU).toString());
            }
            if(criteria.containsKey(Laptop.DISPLAY_INCHS)) {
                double display = Double.parseDouble(criteria.get(Laptop.DISPLAY_INCHS).toString());
            }
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
