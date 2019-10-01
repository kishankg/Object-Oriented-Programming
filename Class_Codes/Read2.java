import java.io.*;
public class Read2
{
public static void main(String[] args) throws Exception
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

	// remove throws exception from main and use separate try catch  block here . IO Exception for reaading the file, after using it while writing the FileReader constructor, has to be included as well in this programme.
	//try
	{
	while 	((i = fr.read()) != -1)
	{
	System.out.println((char) i);
	fr.close();
	}

	//catch (IOException e)
		//{
		//System.out.println("Cannot find file");
		//return;
		//}


	}
}
