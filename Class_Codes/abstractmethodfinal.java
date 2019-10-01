
abstract class honda
{
	int rupees;
	abstract void run();
	final void cost(int rupees)
	{
		System.out.println("Cost is " + rupees);
	}
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

public class abstractmethodfinal
{
	public static void main(String[] args)
	{
	auto Jazz = new auto();
	manual City = new manual();
	honda car = new auto();
	car.cost(50000);
	//auto.cost(4500); //this gives an error if cost is not declared static
	}
}
