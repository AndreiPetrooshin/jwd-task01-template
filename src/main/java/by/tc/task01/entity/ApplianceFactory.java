package by.tc.task01.entity;

import java.util.Properties;

public final class ApplianceFactory {

    private ApplianceFactory(){

    }

    public static Appliance getAppliance(String appliance, Properties properties){
        if(appliance.equalsIgnoreCase("Oven")){
            return Oven.create(properties);
        }
        if(appliance.equalsIgnoreCase("Laptop")){
            return Laptop.create(properties);
        }
        if(appliance.equalsIgnoreCase("Refrigerator")){
            return Refrigerator.create(properties);
        }
        if(appliance.equalsIgnoreCase("VacuumCleaner")){
            return VacuumCleaner.create(properties);
        }
        if(appliance.equalsIgnoreCase("TabletPC")){
            return TabletPC.create(properties);
        }
        if(appliance.equalsIgnoreCase("Speakers")){
            return Speakers.create(properties);
        }
        return null;
    }

}
