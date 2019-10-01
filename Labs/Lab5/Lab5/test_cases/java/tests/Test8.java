public class Test extends AbstractTest {
	public int test() {
		int score = 0;

		if (runTest(PartTimeStudentTest.class, "testPartTimeStudent") && runTest(FullTimeStudentTest.class, "testFullTimeStudent"))
			score = 1;
		return score;
	}
}
