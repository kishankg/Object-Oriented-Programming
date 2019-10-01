abstract class honda
{
abstract void run();
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

public class abstractmethod
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

