/**
* Application containing main method to test the program.
*
* @author Andrew Ross-Sermons
* @version 1.1
* CS131; Project #1
* Spring 2023
*/

public class Application {
	public static void main(String[] args) {
		System.out.println("\n###=======================================================================###");//main open
		//Introduction
		System.out.println("This application conatains class declarations and method calls to demonstrate"
				+ "\nthe functionality of an International Building Code (IBC) compliant mapping software."
				+ "\n\nSee Application.java to view all commands.");
		//Building
		Building building1 = new Building("Cowhaven Lot", "123 Cowhaven St.", 25000, "Business", "Group B");
		System.out.println(building1.displayData());
		building1.draw();
		//Business
		Business business1 = new Business("Laurel Center", "45 Magnolia Ave.", 30000, "Business", "Group B");
		business1.setNumRentableUnits(15);
		System.out.println(business1.displayData());
		business1.draw();
		//Mall
		Mall mall1 = new Mall("Evertides Mall", "678 Welcome St.", 50000, "Business", "Group B");
		mall1.setNumRentableUnits(36);
		mall1.setNumRentedUnits(32);
		mall1.setNumParkingSpaces(2500);
		mall1.setMedianUnitSize(250);
		System.out.println(mall1.displayData());
		mall1.draw();
		//Residential
		Residential res1 = new Residential("Green Residential", "9010 Carrot Rd.", 25000, "Residential", "Group R-1");
		res1.setNumBedrooms(50);
		res1.setNumBathrooms(50);
		res1.setLaundryRoom(true);
		System.out.println(res1.displayData());
		res1.draw();
		//Apartment
		Apartment ap1 = new Apartment("Sunrise Apartments", "1112 MyRoommateSmokesTooMuchWeed Ave.", 30000, "Residential", "Group R-2");
		ap1.setNumBedrooms(50);
		ap1.setNumBathrooms(50);
		ap1.setLaundryRoom(true);
		ap1.setAvgUnitSize(500);
		ap1.setNumRentableUnits(20);
		ap1.setParkingAvailable(true);
		System.out.println(ap1.displayData());
		ap1.draw();
		//SingleFamilyHome
		SingleFamilyHome sfh1 = new SingleFamilyHome("Red House", "502 West Maple St.", 10000, "Residential", "Group R-3");
		sfh1.setNumBedrooms(4);
		sfh1.setNumBathrooms(2);
		sfh1.setLaundryRoom(true);
		sfh1.setGarage(true);
		System.out.println(sfh1.displayData());
		sfh1.draw();
		System.out.println("###=======================================================================###");//main close
	}//end main
}//end
