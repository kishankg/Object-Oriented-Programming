import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TeacherTest.
 *
 * @author Ankshit Jain
 * @version 8th September, 2018
 */
public class TeacherTest extends SchoolMemberTest {
	@Override
	@Before
	public void setUp() {
		super.setUp();	
	}

	private void setupTeacher() {
		this.teacher1 = new Teacher(this.name6, this.address6);
		this.teacher2 = new Teacher(this.name4, this.address4);
	}

	@Test
	public void testTeacherToString() {
		String testString1, testString2;
		setupTeacher();
		testString1 = this.teacher1.toString();
		testString2 = this.teacher2.toString();
		assertEquals(testString1.contains("Teacher"), true);
		assertEquals(testString2.contains("Teacher"), true);
		assertEquals(testString1.contains("Student"), false);
		assertEquals(testString2.contains("Student"), false);
		assertEquals(testString1.contains(this.name6), true);
		assertEquals(testString2.contains(this.name4), true);
		assertEquals(testString1.contains(this.address6), true);
		assertEquals(testString2.contains(this.address4), true);
	}

	private void setupTeacherFloatCourses() {
		((Teacher) this.teacher1).floatCourse("AI", 3);
		((Teacher) this.teacher1).floatCourse("ML", 3);
		((Teacher) this.teacher1).floatCourse("CA", 4);
		((Teacher) this.teacher2).floatCourse("NNFL", 3);
		((Teacher) this.teacher2).floatCourse("DM", 5);
	}

	@Test
	public void testTeacherFloatCourse() {
		setupTeacher();
		setupTeacherFloatCourses();
		assertEquals(((Teacher) this.teacher1).floatCourse("NNFL", 3), true);
		assertEquals(((Teacher) this.teacher1).floatCourse("AI", 3), false);
		assertEquals(((Teacher) this.teacher1).floatCourse("AI", 6), false);
		assertEquals(((Teacher) this.teacher2).floatCourse("DSTN", 3), true);
		assertEquals(((Teacher) this.teacher2).floatCourse("DM", 5), false);
	}

	private void setupTeacherAddFeedback() {
		setupTeacherFloatCourses();
		((Teacher) this.teacher1).addFeedback("AI", 50);
		((Teacher) this.teacher1).addFeedback("ML", 70);
		((Teacher) this.teacher1).addFeedback("CA", 57);
		((Teacher) this.teacher2).addFeedback("NNFL", 40);
		((Teacher) this.teacher2).addFeedback("DM", 120);
	}

	@Test
	public void testAddFeedback() {
		setupTeacher();
		setupTeacherAddFeedback();
		assertEquals(((Teacher) this.teacher1).addFeedback("CA", 30), true);
		assertEquals(((Teacher) this.teacher1).addFeedback("AI", 70), true);
		assertEquals(((Teacher) this.teacher1).addFeedback("DM", 30), false);
		assertEquals(((Teacher) this.teacher2).addFeedback("DM", 70), true);
		assertEquals(((Teacher) this.teacher2).addFeedback("CA", 30), false);
	}

	private void setupTeacherFloatCoursesAndAddFeedback() {
		((Teacher) this.teacher1).floatCourse("NNFL", 3);
		((Teacher) this.teacher1).addFeedback("NNFL", 63);

		((Teacher) this.teacher2).floatCourse("DSA", 40);
		((Teacher) this.teacher2).addFeedback("DSA", 17);

	}

	@Test
	public void testAverageFeedbackAndPromoted() {
		setupTeacher();
		assertEquals(((Teacher) this.teacher1).getAverageFeedback(), 0);
		assertEquals(((Teacher) this.teacher2).getAverageFeedback(), 0);
		assertEquals(((Teacher) this.teacher1).promoted(), 0);
		assertEquals(((Teacher) this.teacher2).promoted(), 0);
		setupTeacherAddFeedback();
		assertEquals(((Teacher) this.teacher1).getAverageFeedback(), 59);
		assertEquals(((Teacher) this.teacher2).getAverageFeedback(), 80);
		assertEquals(((Teacher) this.teacher1).promoted(), 0);
		assertEquals(((Teacher) this.teacher2).promoted(), 1);
		setupTeacherFloatCoursesAndAddFeedback();
		assertEquals(((Teacher) this.teacher1).getAverageFeedback(), 60);
		assertEquals(((Teacher) this.teacher2).getAverageFeedback(), 59);
		assertEquals(((Teacher) this.teacher1).promoted(), 1);
		assertEquals(((Teacher) this.teacher2).promoted(), 0);
	}

	
	@Override
	@After
	public void tearDown() {
		super.tearDown();
	}
}
