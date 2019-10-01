/**
 * This class represents a student of a school.
 * 
 * @author Swathi, Ajay
 * @version 8th September, 2018
 */
public class Student extends SchoolMember {

	/**
	 * This represents the number of courses taken so far.
	 */
	private int numCourses;

	/**
	 * This represents the number of credits taken so far.
	 */
	private int numCredits;

	/**
	 * This represents the course codes of the courses taken by the student.
	 */
	private String[] courses;

	/**
	 * This represents grades obtained in the corresponding courses.
	 */
	private int[] grades;

	/**
	 * This represents the maximum number of courses allowed(4)
	 */
	private static final int MAX_NUMBER_OF_COURSES = 4;

	/**
	 * This represents the maximum number of credits allowed(20)
	 */
	private static final int MAX_CREDITS = 20;

	/**
	 * This represents the minimum number of credits.
	 */
	protected int minCredits;

	/**
	 * This represents the required average grade for promotion(75)
	 */
	private static final int REQUIRED_PERCENTAGE_FOR_PROMOTION = 75;

	/**
	 * Constructor for objects of class Student. Variables {@code name} and
	 * {@code address} are initialised using the base class's constructor.
	 * Initialise {@code numCourses} to 0 and create arrays {@code courses} and
	 * {@code grades} of size {@code MAX_NUMBER_OF_COURSES}. Default value for
	 * minCredits is 10.
	 * 
	 * @param name    specifies the name of the person
	 * @param address specifies the address of the person
	 */
	public Student(String name, String address) {
		super(name, address);
		this.minCredits = 10;
		this.numCourses = 0;
		this.numCredits = 0;
		this.courses = new String[MAX_NUMBER_OF_COURSES];
		this.grades = new int[MAX_NUMBER_OF_COURSES];
	}

	/**
	 * This method overrides the default toString method to print name and address
	 * in the form "Student: name (address)"<br>
	 * For example, Name = {@code Jesse}, Address = {@code 9809 Margo Street},<br>
	 * the string returned should be "Student: Jesse (9809 Margo Street)"<br>
	 * 
	 * @return Returns the above specified string
	 */
	@Override
	public String toString() {
		return "Student: " + super.toString();
	}

	/**
	 * This method aims to register a student for a course. A student can
	 * successfully register only if he has enough course slots left and does not
	 * exceed his maximum allowed credits and if he has not already registered for
	 * the course before
	 * 
	 * @param course specifies the name of the course
	 * @param credit specifies the credits for the course
	 * @return Returns true if student successfully registered for course, otherwise
	 *         returns false
	 */
	public boolean registerCourse(String course, int credit) {
		for (int i = 0; i < this.numCourses; i++) {
			if (courses[i].equals(course))
				return false;
		}
		if (exceedsMaxCredits(credit)) {
			return false;
		}
		if (!enoughCourseSlots()) {
			return false;
		}
		this.courses[this.numCourses] = course;
		this.numCourses++;
		this.numCredits += credit;
		return true;
	}

	/**
	 * This method tells whether registration was successful. Registration is
	 * successful when the person has taken the correct number of required courses
	 * and when credits taken are between prescribed limits.
	 * 
	 * @return Returns true if student registration is successful, otherwise false
	 */
	public boolean isRegistrationSuccessful() {
		if (numCredits >= this.minCredits) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method aims to add the grade for a particular course. For the
	 * corresponding course, the grade should be added at the corresponding
	 * location.<br>
	 * For example, if "ML" couse is at position 2 in courses array, the grade
	 * passed for "ML" course should be updated at position 2 of grades array.
	 * 
	 * @param course specifies the course whose grade should be updated
	 * @param grade  specifies the grade for the course
	 * 
	 * @return Returns true if the grade was successfully added, else returns false
	 */
	public boolean addGrades(String course, int grade) {
		int index = -1;
		for (int i = 0; i < this.numCourses; i++) {
			if (course.equals(this.courses[i])) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			this.grades[index] = grade;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method tells whether there are enough course slots left to fill.
	 * 
	 * @return Returns true if enough course slots are left to fill, otherwise false
	 */
	private boolean enoughCourseSlots() {
		if (numCourses < MAX_NUMBER_OF_COURSES)
			return true;
		else
			return false;
	}

	/**
	 * This method tells whether the student has exceeded the maximum credits
	 * allowed.
	 * 
	 * @param credit specifies the credits
	 * @return Returns true if maximum credits exceeded, otherwise false
	 */
	private boolean exceedsMaxCredits(int credit) {
		if ((numCredits + credit) > MAX_CREDITS) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method provides the average of all the grades and sets the
	 * chanceOfPromotion variable. If no courses are present, average grade is
	 * 100.<br>
	 * 
	 * @return Returns average of grades
	 */
	public int getAverageGrade() {
		int result = 100;
		int sum = 0;
		for (int i = 0; i < this.numCourses; i++) {
			sum += grades[i];
		}
		if (this.numCourses > 0) {
			result = sum / this.numCourses;
		}
		super.setChanceOfPromotion(result);
		return result;
	}

	/**
	 * This method tells whether a student can be promoted or not. A student can be
	 * promoted if his chanceOfPromotion satisfies the minimum percentage required
	 * 
	 * @return Returns 1 if the student can be promoted, otherwise 0
	 */
	@Override
	public int promoted() {
		int chanceOfPromotion = super.promoted();
		if (chanceOfPromotion >= REQUIRED_PERCENTAGE_FOR_PROMOTION) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * This method is used to remove a course from the registered courses.<br>
	 * After removing the course, the number of courses should be reduced.
	 *
	 * @param course specifies the course to be removed
	 * @return Returns true if course removal was successful, otherwise false
	 */
	public boolean removeCourse(String course) {
		int courseIndex = -1;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courseIndex = i;
				break;
			}
		}
		if (courseIndex != -1) {
			for (int i = courseIndex; i < numCourses - 1; i++) {
				courses[i] = courses[i + 1];
			}
			numCourses--;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method returns the min credits.
	 * 
	 * @return Returns the min credits
	 */
	public int getMinCredits() {
		return this.minCredits;
	}

	/**
	 * This method returns the number of courses.
	 * 
	 * @return Returns the number of courses
	 */
	public int getNumberOfCourses() {
		return this.numCourses;
	}
}
