//reading input file and writing it into output file

import java.io.*;
public class Read6
{
	public static void main(String[] args) throws IOException
	{
	FileInputStream f1;
	FileOutputStream f2;

	f1 = new FileInputStream("Read.txt");
	f2 = new FileOutputStream("B.png");
	//A should be existing file

	int i;
	while(true)
	{
		i = f1.read();
		if(i==-1) break;
		System.out.println(i);
	}
	System.out.println((char) i);
	f1.close();
	}

	//picture. In character Read7.java, everything is same except constructor

}
