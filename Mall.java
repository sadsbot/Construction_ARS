/**
* Class Description
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Construction #1
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
	 * Preferred constructor with parameters for top superclass.
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numRentedUnits = 0;
		numParkingSpaces = 0;
		medianUnitSize = 0;
	}//end preferred constructor
	
	/**
	 * Currently prints a draw status update.
	 */
	public void draw() {
		System.out.println("Drawing Code for Mall.");
	}//end draw
	
	/**
	 * Returns formatted string of all object fields.
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
}//end
