/**
* Third tier of class hierarchy.
* The Mall class contains additional data useful for
* mall businesses.
*
* @author Andrew Ross-Sermons
* @version 1.1
* CS131; Project #1
* Spring 2023
*/

public class Mall extends Business{
	private int numRentedUnits, numParkingSpaces;
	private double medianUnitSize;
	
	/**
	 * Default, empty-argument constructor.
	 */
	public Mall() {
		super();
		numRentedUnits = 0;
		numParkingSpaces = 0;
		medianUnitSize = 0;
	}//end default constructor
	
	/**
	 * Preferred constructor with parameters for all variables.
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 * @param numRentableUnits
	 * @param numRentedUnits
	 * @param numParkingSpaces
	 * @param medianUnitSize
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup,
			int numRentableUnits, int numRentedUnits, int numParkingSpaces, double medianUnitSize) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.numParkingSpaces = numParkingSpaces;
		this.medianUnitSize = medianUnitSize;
	}//end preferred constructor
	
	/**
	 * Currently prints a draw status update.
	 */
	public void draw() {
		System.out.println("Drawing Code for Mall.");
	}//end draw
	
	/**
	 * Returns formatted string of all object variables.
	 * @return the String of data
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("\nMall");
		sb.append("\nnumRentedUnits = " + numRentedUnits);
		sb.append("\nnumParkingSpaces = " + numParkingSpaces);
		sb.append("\nmedianUnitSize = " + medianUnitSize);
		sb.append("\n##====================================##");
		return sb.toString();
	}//end displayData

	/**
	 * @return the numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits

	/**
	 * @param numRentedUnits the numRentedUnits to set
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	/**
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces

	/**
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	/**
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize
	
	/**
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	/**
	 * Returns a string representation of the object.
	 * @return the String
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", numParkingSpaces=" + numParkingSpaces + ", medianUnitSize="
				+ medianUnitSize + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", occupancyGroup=" + occupancyGroup + ", subGroup="
				+ subGroup + ", totalSquareFeet=" + totalSquareFeet + "]";
	}//end toString
}//end
