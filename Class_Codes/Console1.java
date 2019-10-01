import java.io.*;
class Console1
{
	public static void main(String[] args)
	{
		Console con = System.console();
		String str = con.readLine("Enter a string");
		con.printf("Your string %s", str);
		char[] pass = con.readPassword("Enter password");
		String password = String.valueOf(pass);
		con.printf("Your password %s\n", password);
	}
}
//PICTre from Akshita
