public class Test extends AbstractTest {
  public int test() {
		int score = 0;

		if (runTest(TeacherTest.class, "testTeacherFloatCourse"))
		   score = 1;
		return score;
	}
}
