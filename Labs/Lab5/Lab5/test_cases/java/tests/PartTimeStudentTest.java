import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PartTimeStudentTest.
 *
 * @author Ankshit Jain
 * @version 8th September, 2018
 */
public class PartTimeStudentTest extends SchoolMemberTest {

	@Before
	@Override
	public void setUp() {
		super.setUp();
	}

	public void setupPartTimeStudent() {
		this.partTimeStudent1 = new PartTimeStudent(this.name1, this.address1, 7);
		this.partTimeStudent2 = new PartTimeStudent(this.name2, this.address2, 5);
	}

	@Test
	@Override
	public void testToString() {
		String testString1, testString2;
		setupPartTimeStudent();
		testString1 = this.partTimeStudent1.toString();
		testString2 = this.partTimeStudent2.toString();
		assertEquals(testString1.contains("Teacher"), false);
		assertEquals(testString2.contains("Teacher"), false);
		assertEquals(testString1.contains("PartTimeStudent"), true);
		assertEquals(testString2.contains("PartTimeStudent"), true);
		assertEquals(testString1.contains("FullTimeStudent"), false);
		assertEquals(testString2.contains("FullTimeStudent"), false);
		assertEquals(testString1.split("Student", -1).length - 1, 1);
		assertEquals(testString2.split("Student", -1).length - 1, 1);
		assertEquals(testString1.contains(this.name1), true);
		assertEquals(testString2.contains(this.name2), true);
		assertEquals(testString1.contains(this.address1), true);
		assertEquals(testString2.contains(this.address2), true);
	}
	
	@Test
	public void testPartTimeStudent() {
		setupPartTimeStudent();
		assertEquals(((PartTimeStudent) this.partTimeStudent1).getMinCredits(), 3);
		assertEquals(((PartTimeStudent) this.partTimeStudent2).getMinCredits(), 5);
	}

	@After
	@Override
	public void tearDown() {
		super.tearDown();
	}
}
