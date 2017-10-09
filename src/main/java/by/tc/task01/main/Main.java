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

		Criteria<Speakers> spk1 = new Criteria<>();
		spk1.setApplianceType("Speakers");
		spk1.add(Speakers.POWER_CONSUMPTION, 19.4);
		spk1.add(Speakers.POWER_CONSUMPTION, 17);
		spk1.add(Speakers.POWER_CONSUMPTION, 20);
		spk1.add(Speakers.POWER_CONSUMPTION, 15);


		appliance = service.find(spk1);
		PrintApplianceInfo.print(appliance);



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
		appliance  = service.find(cleanerCriteria);
		PrintApplianceInfo.print(appliance);

		////////////////////////////////////////////////////////

		Criteria<Oven> criteria = new Criteria<>();
		criteria.setApplianceType("Oven");
		criteria.add(Oven.CAPACITY, 33);
		criteria.add(Oven.DEPTH, 60);
		criteria.add(Oven.WIDTH, 68);
		appliance = service.find(criteria);
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<Oven>();
		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.CAPACITY, 3);
		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);
		///////////////////////////////////////////////////////////

		Criteria<Laptop> laptopCriteria = new Criteria<>();
		laptopCriteria.setApplianceType("Laptop");
		laptopCriteria.add(Laptop.BATTERY_CAPACITY, 1);
		laptopCriteria.add(Laptop.OS, "Windows");
		laptopCriteria.add(Laptop.DISPLAY_INCHS,18);
		appliance = service.find(laptopCriteria);

		PrintApplianceInfo.print(appliance);


		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>();
		criteriaOven.setApplianceType("Oven");
	 	criteriaOven.add(Oven.HEIGHT, 200);
		criteriaOven.add(Oven.DEPTH, 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
		criteriaTabletPC.setApplianceType("TabletPC");
		criteriaTabletPC.add(TabletPC.COLOR, "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);


		///////////////////////////////////////////////////////////

		Criteria<Refrigerator> refrigeratorCriteria = new Criteria<>();
		refrigeratorCriteria.setApplianceType("Refrigerator");
		refrigeratorCriteria.add(Refrigerator.FREEZER_CAPACITY, 20);
		refrigeratorCriteria.add(Refrigerator.POWER_CONSUMPTION, 150);
		refrigeratorCriteria.add(Refrigerator.WIDTH, 75);
		appliance = service.find(refrigeratorCriteria);

		PrintApplianceInfo.print(appliance);




	}

}
