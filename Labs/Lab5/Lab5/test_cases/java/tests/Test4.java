public class Test extends AbstractTest {
	public int test() {
		int score = 0;

		if (runTest(StudentTest.class, "testStudentRegisterCourse"))
			score = 1;
		return score;
	}
}
