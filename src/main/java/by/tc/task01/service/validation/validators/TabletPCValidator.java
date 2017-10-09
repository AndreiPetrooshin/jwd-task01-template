package by.tc.task01.service.validation.validators;

import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import java.util.Map;


public class TabletPCValidator implements ValidatorAppliance {
    @Override
    public <E> boolean validate(Map<E, Object> criteria) {
        try {
            if(criteria.containsKey(TabletPC.BATTERY_CAPACITY)) {
                int batteryCapacity = (int) criteria.get(TabletPC.BATTERY_CAPACITY);
            }
            if(criteria.containsKey(TabletPC.DISPLAY_INCHES)) {
                int displayInches =  (int)criteria.get(TabletPC.DISPLAY_INCHES);
            }
            if(criteria.containsKey(TabletPC.MEMORY_ROM)) {
                int memoryRom = (int) criteria.get(TabletPC.MEMORY_ROM);
            }
            if(criteria.containsKey(TabletPC.FLASH_MEMORY_CAPACITY)) {
                int flashMemoryCapacity = (int) criteria.get(TabletPC.FLASH_MEMORY_CAPACITY);
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
