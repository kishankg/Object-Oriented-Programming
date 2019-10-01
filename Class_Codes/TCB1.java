//  nextInt is an in-built method in Random class

import java.util.Random;
public class TCB1
{
	public static void main(String args[])
	{
	int a = 0, b ,c;
	Random x = new Random();
	for (int i = 0; i<5; i ++)
		{
		try
			{
			b = x.nextInt();
			c = x.nextInt();
			System.out.println(b);
			System.out.println(c);
			a = 222/ (b/c);
			System.out.println("a : " + a);			
			}
		catch (ArithmeticException e)
			{
			System.out.println("Dividing by zero");
			}
		System.out.println("a : " + a);
		}
	}
}
