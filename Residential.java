/**
* Class Description
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Construction #1
* Spring 2023
*/

public class Residential extends Building{
	protected int numBedrooms, numBathrooms;
	protected boolean laundryRoom;
	
	/**
	 * Default, empty-argument constructor.
	 */
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end default constructor
	
	/**
	 * Preferred constructor with parameters for top superclass.
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end preferred constructor
	
	/**
	 * Currently prints a draw status update.
	 */
	public void draw() {
		System.out.println("Drawing Code for Residential.");
	}//end draw
	
	/**
	 * Returns formatted string of all object fields.
	 * @return the String of data
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("\nResidential");
		sb.append("\nnumBedrooms = " + numBedrooms);
		sb.append("\nnumBathrooms = " + numBathrooms);
		sb.append("\nlaundryRoom = " + laundryRoom);
		sb.append("\n##====================================##");
		return sb.toString();
	}//end displayData

	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}

	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
}
