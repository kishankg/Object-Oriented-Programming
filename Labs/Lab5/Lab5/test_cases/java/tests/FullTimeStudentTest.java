import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FullTimeStudentTest.
 *
 * @author Ankshit Jain
 * @version 8th September, 2018
 */
public class FullTimeStudentTest extends SchoolMemberTest {
	@Before
	@Override
	public void setUp() {
		super.setUp();
	}

	public void setupFullTimeStudent() {
		this.fullTimeStudent1 = new FullTimeStudent(this.name3, this.address3, 20);
		this.fullTimeStudent2 = new FullTimeStudent(this.name4, this.address4, 24);
	}

	@Test
	@Override
	public void testToString() {
		String testString1, testString2;
		setupFullTimeStudent();
		testString1 = this.fullTimeStudent1.toString();
		testString2 = this.fullTimeStudent2.toString();
		assertEquals(testString1.contains("Teacher"), false);
		assertEquals(testString2.contains("Teacher"), false);
		assertEquals(testString1.contains("PartTimeStudent"), false);
		assertEquals(testString2.contains("PartTimeStudent"), false);
		assertEquals(testString1.contains("FullTimeStudent"), true);
		assertEquals(testString2.contains("FullTimeStudent"), true);
		assertEquals(testString1.contains(this.name3), true);
		assertEquals(testString2.contains(this.name4), true);
		assertEquals(testString1.contains(this.address3), true);
		assertEquals(testString2.contains(this.address4), true);
		assertEquals(testString1.split("Student", -1).length - 1, 1);
		assertEquals(testString2.split("Student", -1).length - 1, 1);

	}
	@Test
	public void testFullTimeStudent() {
		setupFullTimeStudent();
		assertEquals(((FullTimeStudent) this.fullTimeStudent1).getMinCredits(), 30);
		assertEquals(((FullTimeStudent) this.fullTimeStudent2).getMinCredits(), 34);
	}

	@After
	public void tearDown() {
		super.tearDown();
	}
}
