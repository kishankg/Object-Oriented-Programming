class car
{
public static void run()
	{
	System.out.println("Car runs");
	}
}

class city extends car
{
public void run()
	{
	System.out.println("City runs");
	}
}



public class dynamicbinding
{
public static void main(String[] args)
	{
	//reference is of car type and object of city type
	car car1 = new city();
	//reference is of car type and object of car type
	car car2 = new car();
	car1.run();
	car2.run();
	//static from function run() removed, thus, method is overriden by the subclass and outputs differ for each run function
	}

}
