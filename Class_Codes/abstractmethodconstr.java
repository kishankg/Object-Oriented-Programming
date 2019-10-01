abstract class honda
{
abstract void run();

	honda()
	{
	System.out.println("Autocar and manual car with 2 and 5 gears");
	} //presence of constructor leads to it being printed whenever object of child class(es) is created in main
}

class auto extends honda
{
	void run()
	{
	System.out.println("Autocar with 2 gears");
	}
}

class manual extends honda
{
	void run()
	{
	System.out.println("Manual car with 5 gears");
	}
}

public class abstractmethodconstr
{
	public static void main(String[] args)
	{
	auto Jazz = new auto();
	manual City = new manual();
	//honda car = new honda(); //error
	Jazz.run();
	City.run();
	}
}
