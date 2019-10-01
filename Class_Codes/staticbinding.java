class car
{
public static void run()
	{
	System.out.println("Car runs");
	}
}

class city extends car
{
public static void run()
	{
	System.out.println("City runs");
	}
}



public class staticbinding
{
public static void main(String[] args)
	{
	//reference is of car type and object of city type
	city car1 = new city();
	//reference is of car type and object of car type
	car car2 = new car();
	car1.run();
	car2.run();
	//static function run(), thus, once it sees reference the compiler sees the function as referred to superclass
	}

}
