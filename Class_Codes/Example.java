/*class Maruti
{
int airbags = 10;
double mileage = 12.45;

	Maruti(int airbags, double mileage)
	{
	airbags = airbags;
	mileage = mileage;
	System.out.println("Local constructor : Airbags : " + airbags + " Mileage : " + mileage);
	}
	
	void display()
	{
	System.out.println("Class : Airbags = " + airbags + " Mileage = " + mileage);
	}
}

public class Example
{
	public static void main(String[] args)
	{
		Maruti ciaz = new Maruti(2,12.5);
		Maruti baleno = new Maruti();
		ciaz.display();
		baleno.display();
	}
}
*/

/*import java.util.*;

public class Example
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	//scan.close();
	
	// creating array of size n
	int[] a = new int[n];
	
	//taking input
	//Scanner scan1 = new Scanner(System.in);
	for (int j = 0; j < n; j++)
		{
		a[j] = scan.nextInt();
		}
	scan.close();
	
	//printing output
	for (int i = 0; i < a.length; i++)
		{System.out.println(a[i]);}
	
	}
}
*/

class Rectangle
{
	//variable declaration
	int width;
	int height;
			
	//method
	int area()
	{
	return (width*height);
	}


}

public class Example
{
	public static void main(String[] args)
	{
	Rectangle myRect = new Rectangle();
	myRect.width = 20;
	myRect.height = 10;
	System.out.println("Area is " + myRect.area());
	}

}


































