import java.io.*;
public class Read3
{
public static void main(String[] args)
	{
	int i;
	FileReader fr;

	try
		{
		fr = new FileReader(home\\parul\\Desktop\\OOP\\Programs\\After midsem\\File1);
		}

		catch (IOException e)
		{
		System.out.println("Cannot find file");
		return;
		}


	try
	{
	while 	((i = fr.read()) != -1)
	{
	System.out.println((char) i);
	fr.close();
	}

	catch (IOException e)
		{
		System.out.println("IO exception occurred");
		return;
		}


	}
}
