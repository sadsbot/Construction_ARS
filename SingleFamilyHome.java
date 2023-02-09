/**
* Third tier of class hierarchy.
* The SingleFamilyHome class contains additional data useful for
* homes in a residential building.
*
* @author Andrew Ross-Sermons
* @version 1.1
* CS131; Project #1
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
	 * Preferred constructor with parameters for all variables.
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 * @param garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup,
			int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	}//end preferred constructor
	
	/**
	 * Currently prints a draw status update.
	 */
	public void draw() {
		System.out.println("Drawing Code for SingleFamilyHome.");
	}//end draw
	
	/**
	 * Returns formatted string of all object variables.
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

	/**
	 * Returns a string representation of the object.
	 * @return the String
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup
				+ ", totalSquareFeet=" + totalSquareFeet + "]";
	}//end toString
}//end
