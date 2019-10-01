public class Test extends AbstractTest {
	public int test() {
		int score = 0;

		if (runTest(StudentTest.class, "testStudentRemoveCourses"))
			score = 1;
		return score;
	}
}
