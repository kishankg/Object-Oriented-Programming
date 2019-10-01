import java.io.*;
public class Read1
{
	public static void main(String[] args)
	{
		//pass the path to the file as a parameter
		FileReader fr = new FileReader("Read");
		//use  \\ in file path, single slash can also be used in some systems.
		//filereader is constructor
		int i;
		while(true)
		{
			i = fr.read();
			if(i==-1) break;
			System.out.println(i);
		}
		System.out.println((char) i);
		fr.close();
	}

}
