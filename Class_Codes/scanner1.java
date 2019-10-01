//for user input, using System.in
import java.util.Scanner;

public class scanner1
{
public static void main(String[] args)
	{
	Scanner s1 = new Scanner(System.in);

	System.out.println("Enter your name");
	int name;
	name = s1.nextInt();   //nextline method reads the string

	System.out.println("Name is " + name);

	System.out.println("Enter your insti name");
	String instiname;
	instiname = s1.nextLine();   //nextline method reads the string

	System.out.println("Insti Name is " + instiname);

	}
}
