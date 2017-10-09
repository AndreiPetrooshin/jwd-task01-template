package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import java.util.Map;


public class TabletPCValidator implements ValidatorAppliance {
    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(TabletPC.BATTERY_CAPACITY)) {
                double batteryCapacity = Double.parseDouble(criteria.get(TabletPC.BATTERY_CAPACITY).toString());
            }
            if(criteria.containsKey(TabletPC.DISPLAY_INCHES)) {
                double displayInches =  Double.parseDouble(criteria.get(TabletPC.DISPLAY_INCHES).toString());
            }
            if(criteria.containsKey(TabletPC.MEMORY_ROM)) {
                double memoryRom = Double.parseDouble(criteria.get(TabletPC.MEMORY_ROM).toString());
            }
            if(criteria.containsKey(TabletPC.FLASH_MEMORY_CAPACITY)) {
                double flashMemoryCapacity = Double.parseDouble(criteria.get(TabletPC.FLASH_MEMORY_CAPACITY).toString());
            }
            if(criteria.containsKey(TabletPC.COLOR)) {
                String color = (String)criteria.get(TabletPC.COLOR);
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
