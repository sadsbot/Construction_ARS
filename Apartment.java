/**
* Class Description
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Construction #1
* Spring 2023
*/

public class Apartment extends Residential{
	private double avgUnitSize;
	private int numRentableUnits;
	private boolean parkingAvailable;
	
	/**
	 * Default, empty-argument constructor.
	 */
	public Apartment() {
		avgUnitSize = 0;
		numRentableUnits = 0;
		parkingAvailable = false;
	}//end Apartment
	
	/**
	 * Preferred constructor with parameters for top superclass.
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		avgUnitSize = 0;
		numRentableUnits = 0;
		parkingAvailable = false;
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
		sb.append("\nApartment");
		sb.append("\navgUnitSize = " + avgUnitSize);
		sb.append("\nnumRentableUnits = " + numRentableUnits);
		sb.append("\nparkingAvailable = " + parkingAvailable);
		sb.append("\n##====================================##");
		return sb.toString();
	}//end displayData

	/**
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize

	/**
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

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
	 * @return the parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable

	/**
	 * @param parkingAvailable the parkingAvailable to set
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
}
