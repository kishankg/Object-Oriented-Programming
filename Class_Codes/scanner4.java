import java.io.*;
import java.util.Scanner;

public class scanner4
{
	public static void main(String[] args)
	{
	//String string = new String("This is an OOP class");
	// String string = ""; This gives Boolean result as false. also throws exception
	 String string = "Hi"; //gives true

	Scanner s1 = new Scanner(string);
	System.out.println("Boolean result " + s1.hasNext());   //in this hasNext method we're not being specific about the token we want to see is present or not. It cane be any token.
	System.out.println(s1.next());
	}
}
