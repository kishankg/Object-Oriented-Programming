import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SchoolMemberTest.
 *
 * @author Ankshit Jain
 * @version 8th September, 2018
 */
public class StudentTest extends SchoolMemberTest {
	@Before
	public void setUp() {
		super.setUp();
	}

	public void setupStudent() {
		this.student1 = new Student(this.name2, this.address2);
		this.student2 = new Student(this.name3, this.address3);
	}

	@Test
	public void testToString() {
		String testString1, testString2;
		setupStudent();
		testString1 = this.student1.toString();
		testString2 = this.student2.toString();
		assertEquals(testString1.contains("Student"), true);
		assertEquals(testString2.contains("Student"), true);
		assertEquals(testString1.contains("Teacher"), false);
		assertEquals(testString2.contains("Teacher"), false);
		assertEquals(testString1.contains("PartTimeStudent"), false);
		assertEquals(testString2.contains("PartTimeStudent"), false);
		assertEquals(testString1.contains("FullTimeStudent"), false);
		assertEquals(testString2.contains("FullTimeStudent"), false);
		assertEquals(testString1.contains(this.name2), true);
		assertEquals(testString2.contains(this.name3), true);
		assertEquals(testString1.contains(this.address2), true);
		assertEquals(testString2.contains(this.address3), true);
	}

	@Test
	public void testStudentRegisterCourse() {
		setupStudent();
		assertEquals(((Student) this.student1).registerCourse("NNFL", 6), true);
		assertEquals(((Student) this.student1).registerCourse("NNFL", 5), false);
		assertEquals(((Student) this.student1).isRegistrationSuccessful(), false);
		assertEquals(((Student) this.student1).registerCourse("AI", 6), true);
		assertEquals(((Student) this.student1).isRegistrationSuccessful(), true);
		assertEquals(((Student) this.student1).registerCourse("ML", 5), true);
		assertEquals(((Student) this.student1).registerCourse("DM", 5), false);
		assertEquals(((Student) this.student1).registerCourse("DM", 2), true);
		assertEquals(((Student) this.student1).registerCourse("POPL", 1), false);
		assertEquals(((Student) this.student2).registerCourse("DM", 1), true);
		assertEquals(((Student) this.student2).registerCourse("ML", 1), true);
		assertEquals(((Student) this.student2).registerCourse("POPL", 1), true);
		assertEquals(((Student) this.student2).registerCourse("AI", 1), true);
		assertEquals(((Student) this.student2).isRegistrationSuccessful(), false);
	}

	private void setupStudentRegisterCourses() {
		((Student) this.student1).registerCourse("NNFL", 6);
		((Student) this.student1).registerCourse("ML", 6);
		((Student) this.student1).registerCourse("AI", 6);

		((Student) this.student2).registerCourse("DM", 6);
		((Student) this.student2).registerCourse("ML", 4);
	}

	private void setupStudentAddGrades() {
		setupStudentRegisterCourses();
		((Student) this.student1).addGrades("AI", 60);
		((Student) this.student1).addGrades("ML", 70);
		((Student) this.student1).addGrades("NNFL", 80);
		((Student) this.student2).addGrades("DM", 80);
		((Student) this.student2).addGrades("ML", 70);
	}

	@Test
	public void testAddGrades() {
		setupStudent();
		setupStudentAddGrades();
		assertEquals(((Student) this.student1).addGrades("NNFL", 30), true);
		assertEquals(((Student) this.student1).addGrades("ML", 70), true);
		assertEquals(((Student) this.student1).addGrades("POPL", 30), false);
		assertEquals(((Student) this.student2).addGrades("DM", 70), true);
		assertEquals(((Student) this.student2).addGrades("CA", 30), false);
	}

	private void setupStudentRegisterCoursesAndAddGrades() {
		((Student) this.student1).registerCourse("POPL", 2);
		((Student) this.student1).addGrades("POPL", 90);
		((Student) this.student2).registerCourse("DSA", 4);
		((Student) this.student2).addGrades("DSA", 72);
	}

	@Test
	public void testAverageGradesAndPromoted() {
		setupStudent();
		assertEquals(((Student) this.student1).getAverageGrade(), 100);
		assertEquals(((Student) this.student2).getAverageGrade(), 100);
		assertEquals(((Student) this.student1).promoted(), 1);
		assertEquals(((Student) this.student2).promoted(), 1);
		setupStudentAddGrades();
		assertEquals(((Student) this.student1).getAverageGrade(), 70);
		assertEquals(((Student) this.student2).getAverageGrade(), 75);
		assertEquals(((Student) this.student1).promoted(), 0);
		assertEquals(((Student) this.student2).promoted(), 1);
		setupStudentRegisterCoursesAndAddGrades();
		assertEquals(((Student) this.student1).getAverageGrade(), 75);
		assertEquals(((Student) this.student2).getAverageGrade(), 74);
		assertEquals(((Student) this.student1).promoted(), 1);
		assertEquals(((Student) this.student2).promoted(), 0);
	}

	@Test
	public void testStudentRemoveCourses() {
		setupStudent();
		setupStudentRegisterCourses();
		assertEquals(((Student) this.student2).removeCourse("DM"), true);
		assertEquals(((Student) this.student2).getNumberOfCourses(), 1);
		assertEquals(((Student) this.student2).removeCourse("DM"), false);
		assertEquals(((Student) this.student2).getNumberOfCourses(), 1);
		assertEquals(((Student) this.student2).removeCourse("ML"), true);
		assertEquals(((Student) this.student2).getNumberOfCourses(), 0);
		assertEquals(((Student) this.student2).removeCourse("ML"), false);
		assertEquals(((Student) this.student2).getNumberOfCourses(), 0);
	}

	@Override
	@After
	public void tearDown() {
		super.tearDown();
	}
}
