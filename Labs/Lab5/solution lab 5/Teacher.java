/**
 * This class represents a teacher of a school.
 * 
 * @author Swathi, Ajay
 * @version 8th September, 2018
 */
public class Teacher extends SchoolMember {

	/**
	 * This represents the number of courses taken by teacher.
	 */
	private int numCourses;

	/**
	 * This represents the course codes of the courses taken by the teacher.
	 */
	private String[] courses;

	/**
	 * This represents the credits for each course.
	 */
	private int[] credits;

	/**
	 * This represents the feedback for each course.
	 */
	private int[] feedbacks;

	/**
	 * This represents the maximum number of courses allowed(10)
	 */
	private static final int MAX_NUMBER_OF_COURSES = 10;

	/**
	 * This represents the required average feedback for promotion(60)
	 */
	private static final int REQUIRED_PERCENTAGE_FOR_PROMOTION = 60;

	/**
	 * Constructor for objects of class Teacher. Variables {@code name} and
	 * {@code address} are initialised using the base class's constructor.
	 * Initialise {@code numCourses} to 0 and create arrays {@code courses},
	 * {@code credits} and {@code feedbacks} of size {@code MAX_NUMBER_OF_COURSES}
	 * 
	 * @param name    specifies the name of the person
	 * @param address specifies the address of the person
	 */
	public Teacher(String name, String address) {
		super(name, address);
		this.numCourses = 0;
		courses = new String[Teacher.MAX_NUMBER_OF_COURSES];
		credits = new int[Teacher.MAX_NUMBER_OF_COURSES];
		feedbacks = new int[Teacher.MAX_NUMBER_OF_COURSES];
	}

	/**
	 * This method overrides the default toString method to print name and address
	 * in the form "Teacher: name + (address)".<br>
	 * For example, for Name = {@code Walter}, Address =
	 * {@code 3828 Piermont Dr},<br>
	 * the string returned should be "Teacher: Walter (3828 Piermont Dr)"<br>
	 */
	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}

	/**
	 * This method aims to float a course. A teacher can successfully float a course
	 * only if the course does not exist yet.<br>
	 * Note: Same course with different credits cannot be floated twice.
	 * 
	 * @param course specifies the name of the course
	 * @param credit specifies the credits for the course
	 * @return Returns true if course successfully floated, otherwise false
	 */
	public boolean floatCourse(String course, int credit) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course))
				return false;
		}
		courses[numCourses] = course;
		credits[numCourses] = credit;
		this.numCourses++;
		return true;
	}

	/**
	 * This method aims to add the feedback for a particular course.
	 * 
	 * @param course   specifies position in the feedbacks[] array for the
	 *                 particular course
	 * @param feedback specifies the feedback for the course
	 * @return Return true if feedback was added successfully, else return false
	 */
	public boolean addFeedback(String course, int feedback) {
		int index = -1;
		for (int i = 0; i < this.numCourses; i++) {
			if (course.equals(this.courses[i])) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			this.feedbacks[index] = feedback;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method provides the average of all the feedbacks and sets the
	 * chanceOfPromotion variable. If no courses are present, average feedback is
	 * 0.<br>
	 * Note: This is an int calculation. Do not use any other datatype.
	 * 
	 * @return Returns average of feedbacks
	 */
	public int getAverageFeedback() {
		int result = 0;
		int sum = 0;
		for (int i = 0; i < this.numCourses; i++) {
			sum += this.feedbacks[i];
		}
		if (this.numCourses > 0) {
			result = sum / this.numCourses;
		}
		super.setChanceOfPromotion(result);
		return result;
	}

	/**
	 * This method tells whether a teacher can be promoted or not. A teacher can be
	 * promoted if his chanceOfPromotion satisfies the minimum percentage required
	 * specified by {@code REQUIRED_PERCENTAGE_FOR_PROMOTION}
	 * 
	 * @return Returns 1 if the teacher can be promoted, otherwise 0
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
}
