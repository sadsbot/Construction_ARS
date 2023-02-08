/**
* Highest superclass in program hierarchy.
* The Building class contains variables of building specifications
* and methods for accessing and setting those variables.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Project #1
* Spring 2023
*/

public class Building {
	protected String projectName, completeAddress, occupancyGroup, subGroup;
	protected double totalSquareFeet;
	
	/**
	 * Default, empty-argument constructor.
	 */
	public Building() {
		projectName = "";
		completeAddress = "";
		occupancyGroup = "";
		subGroup = "";
		totalSquareFeet = 0;
	}//end default constructor.

	/**
	 * Preferred constructor with all fields as arguments.
	 * @param projectName
	 * @param completeAddress
	 * @param occupancyGroup
	 * @param subGroup
	 * @param totalSquareFeet
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.totalSquareFeet = totalSquareFeet;
	}//end preferred constructor.
	
	/**
	 * Currently prints a draw status update.
	 */
	public void draw() {
		System.out.println("Drawing Code for Building.");
	}//end draw
	
	/**
	 * Returns formatted string of all object fields.
	 * @return the String of data
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("##====================================##");
		sb.append("\nBuilding");
		sb.append("\nprojectName = " + projectName + "\ncompleteAddress = " + completeAddress);
		sb.append("\noccupancyGroup = " + occupancyGroup + "\nsubGroup = " + subGroup);
		sb.append("\ntotalSquareFeet = " + totalSquareFeet);
		sb.append("\n##====================================##");
		return sb.toString();
	}//end displayData

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	/**
	 * @return the completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * @param completeAddress the completeAddress to set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	/**
	 * @return the occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * @param occupancyGroup the occupancyGroup to set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * @return the subGroup
	 */
	public String getSubGroup() {
		return subGroup;
	}//end getSubGroup

	/**
	 * @param subGroup the subGroup to set
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}//end setSubGroup

	/**
	 * @return the totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * @param totalSquareFeet the totalSquareFeet to set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", occupancyGroup="
				+ occupancyGroup + ", subGroup=" + subGroup + ", totalSquareFeet=" + totalSquareFeet
				+ ", displayData()=" + displayData() + ", getProjectName()=" + getProjectName()
				+ ", getCompleteAddress()=" + getCompleteAddress() + ", getOccupancyGroup()=" + getOccupancyGroup()
				+ ", getSubGroup()=" + getSubGroup() + ", getTotalSquareFeet()=" + getTotalSquareFeet() + "]";
	}//end toString
}//end
