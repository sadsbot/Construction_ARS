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
		//General
		StringBuilder sb = new StringBuilder("\n");
		//Building
		Building building = new Building();
		building.setProjectName("Cowhaven Lot");
		building.setCompleteAddress("123 Cowhaven St.");
		building.setOccupancyGroup("Business");
		building.setSubGroup("Group B");
		building.setTotalSquareFeet(2500);
		sb.append("> Building Getters:\n> getProjectName returns: " + building.getProjectName());
		sb.append("\n> getCompleteAddress returns: " + building.getCompleteAddress());
		sb.append("\n> getOccupancyGroup returns: " + building.getOccupancyGroup());
		sb.append("\n> getSubGroup returns: " + building.getSubGroup());
		sb.append("\n> getTotalSquareFeet returns: " + building.getTotalSquareFeet());
		System.out.println("\n" + sb.toString() + building.displayData());//Print sb for getters and displayData
		building.draw();
		System.out.println("\ntoString: " + building.toString());
		//Business
		Business business = new Business("Laurel Center", "45 Magnolia Ave.", 30000, "Business", "Group B", 0);
		business.setNumRentableUnits(15);
		sb.delete(0, sb.length());//empty sb
		sb.append("> Business Getters:\n> getNumRentableUnits returns: " + business.getNumRentableUnits());
		System.out.println("\n" + sb.toString() + business.displayData());//Print sb for getters and displayData
		business.draw();
		System.out.println("\ntoString: " + business.toString());
		//Mall
		Mall mall = new Mall("Evertides Mall", "678 Welcome St.", 50000, "Business", "Group B", 0, 0, 0, 0);
		mall.setNumRentableUnits(36);
		mall.setNumRentedUnits(32);
		mall.setNumParkingSpaces(2500);
		mall.setMedianUnitSize(250);
		sb.delete(0, sb.length());//empty sb
		sb.append("> Mall Getters:\n> getNumRentedUnits returns: " + mall.getNumRentedUnits());
		sb.append("\n> getNumParkingSpaces returns: " + mall.getNumParkingSpaces());
		sb.append("\n> getMedianUnitSize returns: " + mall.getMedianUnitSize());
		System.out.println("\n" + sb.toString() + mall.displayData());//Print sb for getters and displayData
		mall.draw();
		System.out.println("\ntoString: " + mall.toString());
		//Residential
		Residential res = new Residential("Green Residential", "9010 Carrot Rd.", 25000, "Residential", "Group R-1", 0, 0, false);
		res.setNumBedrooms(50);
		res.setNumBathrooms(50);
		res.setLaundryRoom(true);
		sb.delete(0, sb.length());//empty sb
		sb.append("> Residential Getters:\n> getNumBedrooms returns: " + res.getNumBedrooms());
		sb.append("\n> getNumBathrooms returns: " + res.getNumBathrooms());
		sb.append("\n> isLaundryRoom returns: " + res.isLaundryRoom());
		System.out.println("\n" + sb.toString() + res.displayData());//Print sb for getters and displayData
		res.draw();
		System.out.println("\ntoString: " + res.toString());
		//Apartment
		Apartment ap = new Apartment("Sunrise Apartments", "1112 MyRoommateSmokesTooMuchWeed Ave.", 30000, "Residential", "Group R-2",
				0, 0, false, 0, 0, false);
		ap.setNumBedrooms(50);
		ap.setNumBathrooms(50);
		ap.setLaundryRoom(true);
		ap.setAvgUnitSize(500);
		ap.setNumRentableUnits(20);
		ap.setParkingAvailable(true);
		sb.delete(0, sb.length());//empty sb
		sb.append("> Apartment Getters:\n> getAvgUnitSize returns: " + ap.getAvgUnitSize());
		sb.append("\n> getNumRentableUnits returns: " + ap.getNumRentableUnits());
		sb.append("\n> isParkingAvailable returns: " + ap.isParkingAvailable());
		System.out.println("\n" + sb.toString() + ap.displayData());//Print sb for getters and displayData
		ap.draw();
		System.out.println("\ntoString: " + ap.toString());
		//SingleFamilyHome
		SingleFamilyHome home = new SingleFamilyHome("Red House", "502 West Maple St.", 10000, "Residential", "Group R-3", 0, 0, false, false);
		home.setNumBedrooms(4);
		home.setNumBathrooms(2);
		home.setLaundryRoom(true);
		home.setGarage(true);
		sb.delete(0, sb.length());//empty sb
		sb.append("> SingleFamilyHome Getters:\n> isGarage returns: " + home.isGarage());
		System.out.println("\n" + sb.toString() + home.displayData());//Print sb for getters and displayData
		home.draw();
		System.out.println("\ntoString: " + home.toString());
		//End
		System.out.println("###=======================================================================###");//main close
	}//end main
}//end
