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
public class SchoolMemberTest{
	protected String name1, name2, name3, name4, name5, name6;
	protected String address1, address2, address3, address4, address5, address6;
	protected SchoolMember schoolMember, teacher1, teacher2, student1, student2, partTimeStudent1, partTimeStudent2,
			fullTimeStudent1, fullTimeStudent2;

	@Before
	public void setUp() {
		this.name1 = "Rachel Green";
		this.name2 = "Monica Geller";
		this.name3 = "Phoebe Buffay";
		this.name4 = "Joey Tribbiani";
		this.name5 = "Chandler Bing";
		this.name6 = "Ross Geller";

		this.address1 = "20, 90 Bedford Street";
		this.address2 = "20, 90 Bedford Street";
		this.address3 = "5 Morton Street, Apt 14";
		this.address4 = "19, 90 Bedford Street";
		this.address5 = "19, 90 Bedford Street";
		this.address6 = "19, 90 Bedford Street";
	}

	private void setupSchoolMember() {
		this.schoolMember = new SchoolMember(this.name5, this.address5);
	}

	@Test
	public void testToString() {
		String testString1;
		setupSchoolMember();
		testString1 = this.schoolMember.toString();

		assertEquals(testString1.contains(this.name5), true);
		assertEquals(testString1.contains(this.address5), true);
		assertEquals(testString1.contains("Teacher"), false);
		assertEquals(testString1.contains("Student"), false);
		assertEquals(testString1.contains("PartTimeStudent"), false);
		assertEquals(testString1.contains("FullTimeStudent"), false);
	}

	@After
	public void tearDown() {
		this.name1 = null;
		this.name2 = null;
		this.name3 = null;
		this.name4 = null;
		this.name5 = null;
		this.name6 = null;
		this.address1 = null;
		this.address2 = null;
		this.address3 = null;
		this.address4 = null;
		this.address5 = null;
		this.address6 = null;
		this.schoolMember = null;
		this.teacher1 = null;
		this.teacher2 = null;
		this.student1 = null;
		this.student2 = null;
		this.partTimeStudent1 = null;
		this.partTimeStudent2 = null;
		this.fullTimeStudent1 = null;
		this.fullTimeStudent2 = null;
	}
}
