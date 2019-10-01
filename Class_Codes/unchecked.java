import java.io.File;
import java.io.FileReader;

public class unchecked
{
	public static void main(String[] args)
	{
	int num[] = {1,2,3,4};
	System.out.println(num[5]);
	}
}

//Example of unchecked exception. Doesn't give error during compile time. Gives exception during run-time.
