/**
 * This class represents a Part Time Student in a school. A part time student is
 * exempted a certain amount of credits from the base minimum credits for a
 * student, i.e. the min credits for a part time student is less than a normal
 * student.
 * 
 * @author Swati, Ajay
 * @version 8th September, 2018
 */
public class PartTimeStudent extends Student {
	/**
	 * Constructor for objects of class PartTimeStudent. All variables are
	 * initialised with the values given.
	 * 
	 * @param name    specifies the name of the person
	 * @param address specifies the address of the person
	 * @param credits specifies the credits to be exempted
	 */
	public PartTimeStudent(String name, String address, int credits) {
		super(name, address);
		this.minCredits = this.minCredits - credits;
	}

	/**
	 * This method overrides the default toString method to print name and address
	 * in the form "PartTimeStudent: name (address)"<br>
	 * For example, Name = {@code Jesse}, Address = {@code 9809 Margo Street}, <br>
	 * the string returned should be "PartTimeStudent: Jesse (9809 Margo
	 * Street)"<br>
	 */
	@Override
	public String toString() {
		return "PartTime" + super.toString();
	}
}
