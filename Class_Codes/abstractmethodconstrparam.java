abstract class honda
{
abstract void run();
int gears;

	honda(int gears)
	{
	this.gears = gears;
	System.out.println("Autocar and manual car with gears " + gears);
	} //parameter in constructor
}

class auto extends honda
{
	auto(int x)
	{
		System.out.println(x);
		//super(x);
	}

	void run()
	{
		System.out.println("Autocar with 2 gears");
	}
}

class manual extends honda
{
	manual(int x)
	{
		super(x);
	}

	void run()
	{
	System.out.println("Manual car with 5 gears");
	}
}

public class abstractmethodconstrparam
{
	public static void main(String[] args)
	{
	auto Jazz = new auto(12);
	manual City = new manual(15);
	//honda car = new honda(); //error
	Jazz.run();
	City.run();
	}
}
