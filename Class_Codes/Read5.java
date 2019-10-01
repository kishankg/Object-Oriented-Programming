//not using close explicity
//using try-resources statement

import java.io.*;
public class Read5
{
public static void main(String[] args) 
	{
	int i;
	FileReader fr;
	
	if (args.length != 1)  // that 1 length means it should only be the filename
	{
	System.out.println("Usage : Show filename");
	return;
	}
	
	//picture 
