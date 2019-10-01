import java.io.*;
import java.util.Scanner;

public class scanner5
{
	public static void main(String[] args)
	{
	Scanner s1 = new Scanner(System.in);

	int count = 0;
	int sum =0;

	try
	{

	while (s1.hasNext())  //check if an int value is available. Why is it coming out of loop if hasNext is true when we enter non-int character
	{
	//read an int value
	int num = s1.nextInt();
	sum += num;
	count++;
	}

	}

	//to exit the loop, input any float or any other non-int character

	//also catch divide by zero exception



	int mean;
	try{
		mean = sum/count;
	}
	catch(ArithmeticException h)
	{
	System.out.println("Can't perform arithmetic operation");
	}
	System.out.println("Mean is " + mean);
	System.out.println("Sum is " + sum);
	}
}
