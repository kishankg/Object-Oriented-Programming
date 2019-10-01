import java.io.*;
public class Read4
{
public static void main(String[] args)
	{
	int i;
	FileInputStream fr;

	if (args.length != 1)  // that 1 length means it should only be the filename
	{
	System.out.println("Usage : Show filename");
	return;
	}

	try
	{
	fr = new FileInputStream(args[0]);
	}

	catch(FileNotFoundException e)
	{
	System.out.println("Can't open file");
	return;
	}

	try
	{
	while ((i = fr.read()) != 1)
	System.out.println((char) i);
	}

	catch(IOException e)
	{
	System.out.println("Error reading file");
	}
}
}
