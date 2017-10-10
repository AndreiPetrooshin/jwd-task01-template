package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {


	public static void main(String[] args) {

		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Speakers> speakersCriteria = new Criteria<>();
		speakersCriteria.setApplianceType("Speakers");
		speakersCriteria.add(Speakers.CORD_LENGTH,2);
		speakersCriteria.add(Speakers.FREQUENCY_RANGE, 3);
		speakersCriteria.add(Speakers.NUMBER_OF_SPEAKERS, 2);
		speakersCriteria.add(Speakers.POWER_CONSUMPTION, 15);

		appliance = service.find(speakersCriteria);
		PrintApplianceInfo.print(appliance);


		Criteria<VacuumCleaner> cleanerCriteria = new Criteria<>();
		cleanerCriteria.setApplianceType("VacuumCleaner");
		cleanerCriteria.add(VacuumCleaner.BAG_TYPE,"AA-89");
		cleanerCriteria.add(VacuumCleaner.WAND_TYPE,"all-in-one");
		cleanerCriteria.add(VacuumCleaner.FILTER_TYPE,"B");
		cleanerCriteria.add(VacuumCleaner.POWER_CONSUMPTION,110);
		cleanerCriteria.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 2900);
		cleanerCriteria.add(VacuumCleaner.CLEANING_WIDTH, 25);
		appliance  = service.find(cleanerCriteria);
		PrintApplianceInfo.print(appliance);

		////////////////////////////////////////////////////////

		Criteria<Oven> criteria = new Criteria<>();
		criteria.setApplianceType("Oven");
		criteria.add(Oven.CAPACITY, 32);
		criteria.add(Oven.DEPTH, 60);
		criteria.add(Oven.WIDTH, 59.5);
		criteria.add(Oven.POWER_CONSUMPTION,1000);
		criteria.add(Oven.WEIGHT, 10);
		criteria.add(Oven.HEIGHT, 45.5);
		appliance = service.find(criteria);
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////


		Criteria<Laptop> laptopCriteria = new Criteria<>();
		laptopCriteria.setApplianceType("Laptop");
		laptopCriteria.add(Laptop.BATTERY_CAPACITY, 1);
		laptopCriteria.add(Laptop.OS, "Windows");
		laptopCriteria.add(Laptop.DISPLAY_INCHS,18);
		laptopCriteria.add(Laptop.MEMORY_ROM,4000);
		laptopCriteria.add(Laptop.SYSTEM_MEMORY,1000);
		laptopCriteria.add(Laptop.CPU,1.2);
		appliance = service.find(laptopCriteria);

		PrintApplianceInfo.print(appliance);


		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.setApplianceType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY,3);
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY,2);
		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);


		///////////////////////////////////////////////////////////

		Criteria<Refrigerator> refrigeratorCriteria = new Criteria<>();
		refrigeratorCriteria.setApplianceType("Refrigerator");
		refrigeratorCriteria.add(Refrigerator.FREEZER_CAPACITY, 20);
		refrigeratorCriteria.add(Refrigerator.POWER_CONSUMPTION, 150);
		refrigeratorCriteria.add(Refrigerator.WEIGHT,35);
		refrigeratorCriteria.add(Refrigerator.HEIGHT,250);
		refrigeratorCriteria.add(Refrigerator.OVERALL_CAPACITY,350.5);
		refrigeratorCriteria.add(Refrigerator.WIDTH, 75);
		appliance = service.find(refrigeratorCriteria);

		PrintApplianceInfo.print(appliance);
	}
}
