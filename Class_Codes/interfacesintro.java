interface Car
{
	void run();  //abstract method
	
}

class City implements Car
{
	public void run()   //if we don't write public here it gives errors
	{
	System.out.println("Car running");
	}
}

public class interfacesintro
{
	public static void main(String[] args)
	{
		City c1 = new City();
		c1.run();
	}
	
}
