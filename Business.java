/**
* Second tier of class hierarchy.
* The Business class contains additional data useful for
* business-related buildings.
*
* @author Andrew Ross-Sermons
* @version 1.1
* CS131; Project #1
* Spring 2023
*/

public class Business extends Building{
	protected int numRentableUnits;
	
	/**
	 * Default, empty-argument constructor.
	 */
	public Business() {
		super();
		numRentableUnits = 0;
	}//end default constructor.
	
	/**
	 * Preferred constructor with parameters for all variables.
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 * @param numRentableUnits
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup,
			int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor.
	
	/**
	 * Currently prints a draw status update.
	 */
	public void draw() {
		System.out.println("Drawing Code for Business.");
	}//end draw
	
	/**
	 * Returns formatted string of all object variables.
	 * @return the String of data
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("\nBusiness");
		sb.append("\nnumRentableUnits = " + numRentableUnits);
		sb.append("\n##====================================##");
		return sb.toString();
	}//end displayData

	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	/**
	 * Returns a string representation of the object.
	 * @return the String
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup
				+ ", totalSquareFeet=" + totalSquareFeet + "]";
	}//end toString
}//end
