package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

import java.util.Map;


public class VacuumCleanerValidator implements ValidatorAppliance {
    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(VacuumCleaner.POWER_CONSUMPTION)) {
                int power = (int) criteria.get(VacuumCleaner.POWER_CONSUMPTION);
            }
            if(criteria.containsKey(VacuumCleaner.FILTER_TYPE)) {
                String filterType =  (String)criteria.get(VacuumCleaner.FILTER_TYPE);
            }
            if(criteria.containsKey(VacuumCleaner.BAG_TYPE)) {
                String bagType = (String) criteria.get(VacuumCleaner.BAG_TYPE);
            }
            if(criteria.containsKey(VacuumCleaner.WAND_TYPE)) {
                String wandType = (String) criteria.get(VacuumCleaner.WAND_TYPE);
            }
            if(criteria.containsKey(VacuumCleaner.MOTOR_SPEED_REGULATION)) {
                int motorSpeedRegulation = (int)criteria.get(VacuumCleaner.MOTOR_SPEED_REGULATION);
            }
            if(criteria.containsKey(VacuumCleaner.CLEANING_WIDTH)) {
                int cleaningWidth =(int)criteria.get(VacuumCleaner.CLEANING_WIDTH);
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
