public class Test extends AbstractTest {
	public int test() {
		int score = 0;

		if (runTest(SchoolMemberTest.class, "testToString") 
			&& runTest(StudentTest.class, "testToString")
			&& runTest(TeacherTest.class, "testToString")
			&& runTest(PartTimeStudentTest.class, "testToString")
			&& runTest(FullTimeStudentTest.class, "testToString")
			)
			score = 2;
		return score;
	}
}
