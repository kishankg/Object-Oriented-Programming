abstract class honda
{
	int rupees;
	static int x =1;  //static variable is common to all classes
//int x = 1;  //when we don't declare it static all methods will have their own copy of x when we call the methods
	honda()
	{
		System.out.println("Auto and manual both ");
	}
	abstract void run();
	final void cost(int rupees)
	{
		this.rupees = rupees;
		System.out.println("Cost " + this.rupees);
	}


}

class auto extends honda
{
//int x;   //if we use it it initialises it to 0 and then increments it by 1
	auto()
	{
		System.out.println("Why?");
	}
	void run()
	{
		System.out.println("Auto car with no gears " );
		System.out.println("Value of x is " + ++x);
	}
}

class manual extends honda
{
//int x;
	void run()
	{
		System.out.println("Manual car with 5 gears " );
		System.out.println("Value of x is " + ++x);
	}
}


public class abstractclasswithall
{
	public static void main(String args[])
	{
		auto Jazz = new auto();
		manual City = new manual();
		Jazz.run();
		City.run();
		honda car = new auto();
		car.cost(50000);
	}
}
