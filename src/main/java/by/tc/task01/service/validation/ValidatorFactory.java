package by.tc.task01.service.validation;

import by.tc.task01.service.validation.validators.*;


public final class ValidatorFactory {

    private ValidatorFactory(){

    }

    public static ValidatorAppliance validator(String appliance){
        if (appliance.equalsIgnoreCase("laptop")){
            return new LaptopValidator();
        }
        if (appliance.equalsIgnoreCase("Oven")){
            return new OvenValidator();
        }
        if (appliance.equalsIgnoreCase("Refrigerator")){
            return new RefrigeratorValidator();
        }
        if (appliance.equalsIgnoreCase("VacuumCleaner")){
            return new VacuumCleanerValidator();
        }
        if (appliance.equalsIgnoreCase("TabletPC")){
            return new TabletPCValidator();
        }
        if (appliance.equalsIgnoreCase("Speakers")){
            return new SpeakersValidator();
        }
        return null;
    }

}
