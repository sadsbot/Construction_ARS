/**
* Class Description
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #
* Spring 2023
*/

public class SingleFamilyHome extends Residential{
	private boolean garage;
	
	/**
	 * Default, empty-argument constructor.
	 */
	public SingleFamilyHome() {
		super();
		garage = false;
	}//end default constructor
	
	/**
	 * Preferred constructor with parameters for top superclass.
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		garage = false;
	}//end preferred constructor
	
	/**
	 * Currently prints a draw status update.
	 */
	public void draw() {
		System.out.println("Drawing Code for Apartment.");
	}//end draw
	
	/**
	 * Returns formatted string of all object fields.
	 * @return the String of data
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("\nSingleFamilyHome");
		sb.append("\ngarage = " + garage);
		sb.append("\n##====================================##");
		return sb.toString();
	}//end displayData

	/**
	 * @return the garage
	 */
	public boolean isGarage() {
		return garage;
	}//end isGarage

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage
	
	
}
