/**
* Second tier of class hierarchy.
* The Residential class contains additional data useful for
* residential-related buildings.
*
* @author Andrew Ross-Sermons
* @version 1.1
* CS131; Project #1
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
	 * Preferred constructor with parameters for all variables.
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup,
			int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor
	
	/**
	 * Currently prints a draw status update.
	 */
	public void draw() {
		System.out.println("Drawing Code for Residential.");
	}//end draw
	
	/**
	 * Returns formatted string of all object variables.
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
	}//end getNumBedrooms

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	/**
	 * Returns a string representation of the object.
	 * @return the String
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + ", totalSquareFeet="
				+ totalSquareFeet + "]";
	}//end toString
}//end
