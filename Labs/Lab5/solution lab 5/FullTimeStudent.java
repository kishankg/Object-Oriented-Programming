/**
 * This class represents a Full Time Student in a school. A full time student
 * has to take a certain amount of extra credits apart from the base minimum
 * credits for a student, i.e. the min credits for a full time student is more
 * than a normal student.
 * 
 * @author Swati, Ajay
 * @version 8th September, 2018
 */
public class FullTimeStudent extends Student {
	/**
	 * Constructor for objects of class FullTimeStudent. All variables are
	 * initialised with the values given.
	 * 
	 * @param name    specifies the name of the person
	 * @param address specifies the address of the person
	 * @param credits specifies the additional credits
	 */
	public FullTimeStudent(String name, String address, int credits) {
		super(name, address);
		this.minCredits = this.minCredits + credits;
	}

	/**
	 * This method overrides the default toString method to print name and address
	 * in the form "FullTimeStudent: name (address)"<br>
	 * For example, Name = {@code Jesse}, Address = {@code 9809 Margo Street},<br>
	 * the string returned should be "FullTimeStudent: Jesse (9809 Margo
	 * Street)"<br>
	 * 
	 */
	@Override
	public String toString() {
		return "FullTime" + super.toString();
	}
}
