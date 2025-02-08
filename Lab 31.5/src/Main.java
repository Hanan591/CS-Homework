
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Building buildingA = new Building();
    
		Building buildingB = new Building("Centro", "Bellarmine Blvd., Louisville, Kentucky 40205",30000,"Residential","R1");
		
		//System.out.println(buildingB.toString());
		System.out.println("1. Building Preferred Constructor Test using displayData():");
		System.out.println();
		System.out.println(buildingB.displayData());
		System.out.println("\n2. Building draw() Test:");System.out.println();
		buildingA.draw();
		buildingA.setProjectName("Pasteur Hall");
		buildingA.setCompleteAddress("Bellarmine Blvd., Louisville, Kentucky 40205");
		buildingA.setTotalSquareFeet(10000);
		buildingA.setOccupancyGroup("Residential");
		buildingA.setSubgroup("residentialA");
		
		System.out.println("\n3. Building Default Constructor/Setters Test using displayData():");System.out.println();
		System.out.println(buildingA.displayData());
		
		Business businessA = new Business();
		Business businessB= new Business("BusineshomeB", "Knights Way, Louisville, Kentucky 40205", 25401, "Business","buildingA",2);
		System.out.println("\n4. Business Preferred Constructor Test using toString():");System.out.println();
		System.out.println(businessB.toString());
		businessA.setProjectName("BusineshomeA");
		businessA.setCompleteAddress("Knights Way, Louisville, Kentucky 40205");
		businessA.setTotalSquareFeet(10000);
		businessA.setOccupancyGroup("Business");
		businessA.setSubgroup("buildingA");
		businessA.setNumRentableUnits(1);
		System.out.println("\n5. Business Default Constructor Test printing toString():");System.out.println();
		System.out.println(businessA.toString());
		
		Mall mallA = new Mall();
		Mall MallB = new Mall("Mall2", "10 Harbor Street, Louisville, Kentucky 40205", 25401, "Business","buildingA",2,2,2,2);
		System.out.println("\n6. Mall Preferred Constructor Test printing toString():");System.out.println();
		System.out.println(MallB.toString());
		System.out.println("\n7. Mall draw() Test:");
		mallA.draw();
		mallA.setProjectName("Mall1");
		mallA.setCompleteAddress("40 Harbor Street, Louisville, Kentucky 40205");
		mallA.setTotalSquareFeet(10000);
		mallA.setOccupancyGroup("Business");
		mallA.setSubgroup("buildingA");
		mallA.setNumRentableUnits(1);
		mallA.setNumRentedUnits(1);
		mallA.setMedianUnitSize(2);
		mallA.setNumParkingSpaces(2);
		System.out.println("\n8. Mall Default Constructor/Setters Test printing toString():");System.out.println();
		System.out.println(mallA.toString());
		
		Residential residentialA = new Residential();
		Residential residentialB = new Residential("Residential2", "123 Main Street | Louisville, Kentucky 40205", 25401, "Residential","residentialA",2,2,false);
		System.out.println("\n9.Residential Preferred Constructor Test printing toString():");System.out.println();
		System.out.println(residentialB.toString());
		residentialA.setProjectName("Residential1");
		residentialA.setCompleteAddress("123 Main Street | Louisville, Kentucky 40205");
		residentialA.setTotalSquareFeet(10000);
		residentialA.setOccupancyGroup("Residential");
		residentialA.setSubgroup("residentialA");
		residentialA.setNumBedrooms(1);
		residentialA.setNumBathrooms(1);
		residentialA.setLaundryRoom(true);
		System.out.println("\n10. Residential Default Constructor/Setters Test printing toString():");System.out.println();
		System.out.println(residentialA.toString());
		
		Apartment apartmentA = new Apartment();
		Apartment apartmentB = new Apartment("Restful Arms Apartments", "50 Banana Street, Louisville, Kentucky 40205", 25401, "Residential","residentialA",2,2,false,2,2,false);
		System.out.println("\n11.Apartment Preferred Constructor Test printing toString():");System.out.println();
		System.out.println(apartmentB.toString());
		System.out.println("\n12. Apartment draw() Test:");
		
		apartmentA.draw();
		apartmentA.setProjectName("Sleepy Slide Apartments");
		apartmentA.setCompleteAddress("Spelling Street, Louisville, Kentucky 40205");
		apartmentA.setTotalSquareFeet(10000);
		apartmentA.setOccupancyGroup("Residential");
		apartmentA.setSubgroup("residentialA");
		apartmentA.setNumBedrooms(1);
		apartmentA.setNumBathrooms(1);
		apartmentA.setLaundryRoom(true);
		apartmentA.setNumRentableUnits(2);
		apartmentA.setAvgUnitSize(2.0);
		apartmentA.setParkingAvailable(true);
		System.out.println("\n13. Apartment Default Constructor/Setters Test printing toString():");
		System.out.println(apartmentA.toString());
		
		SingleFamilyHome homeA = new SingleFamilyHome();
		SingleFamilyHome homeB = new SingleFamilyHome("Catty Cottage", "2 Bellman Ave., Louisville, Kentucky 40205", 25401, "Residential","residentialA",2,2,false,false);
		System.out.println("\n14.Home Preferred Constructor Test printing toString():");
		System.out.println(homeB.toString());
		System.out.println("\n15. Home draw() Test:");System.out.println();
		homeA.draw();
		homeA.setProjectName("House");
		homeA.setCompleteAddress("2 Bellman Ave., Louisville, Kentucky 40205");
		homeA.setTotalSquareFeet(10000);
		homeA.setOccupancyGroup("Residential");
		homeA.setSubgroup("residentialB");
		homeA.setNumBedrooms(1);
		homeA.setNumBathrooms(1);
		homeA.setLaundryRoom(true);
		homeA.setGarage(true);
		System.out.println("\n16.Home Default Constructor Test printing toString():");System.out.println();
		System.out.println(homeA.toString());
		
		
		
	}

}