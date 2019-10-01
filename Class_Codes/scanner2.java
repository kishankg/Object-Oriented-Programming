//reading from file
import java.io.*;
import java.util.Scanner;

public class scanner2
{
	public static void main(String[] args) throws Exception
	{
	File file = new File("Read.txt");
	Scanner s1 = new Scanner(file);
	while (s1.hasNext())
	{
		System.out.println(s1.next());
	}
	//System.out.println(s1.nextLine());
	}
}
