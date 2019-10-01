/**
 * This class represents a member of a school who can be either a student or a
 * teacher.
 * 
 * @author Swathi, Ajay
 * @version September 8, 2018
 */

public class SchoolMember {

	/**
	 * This represents the name of the person.
	 */
	private String name;

	/**
	 * This represents the address of the person.
	 */
	private String address;

	/**
	 * Depending on whether the person is a student or teacher, this stores the
	 * value of the metric used to decide whether a person will be promoted or not.
	 * In case of student, it will store the average grade and in case of teacher,
	 * it stores the average feeback.
	 */
	private int chanceOfPromotion;

	/**
	 * Constructor for objects of class SchoolMember. Variables {@code name} and
	 * {@code address} are initialised with the values given.
	 * 
	 * @param name    specifies the name of the person
	 * @param address specifies the address of the person
	 */
	public SchoolMember(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/**
	 * This method aims to set the chance of whether a person will be promoted or
	 * not.
	 * 
	 * @param chance this will be average feedback in case of teacher and it will be
	 *               average grade in case of student
	 */
	protected void setChanceOfPromotion(int chance) {
		this.chanceOfPromotion = chance;
	}

	/**
	 * This method overrides the default toString method to print name and address
	 * in the form {@code name (address)}.<br>
	 * For example, Name = {@code Raj}, Address = {@code 21, Street, Place},<br>
	 * the string returned should be "Raj (21, Street, Place)"<br>
	 * Note: Take care of the position of spaces.
	 * 
	 * @return Returns the above specified string
	 */
	@Override
	public String toString() {
		return this.name + " (" + this.address + ")";
	}

	/**
	 * This method aims to get the detail of whether the person is promoted or not.
	 * 
	 * @return Returns the chance of promotion
	 */
	public int promoted() {
		return this.chanceOfPromotion;
	}
}
