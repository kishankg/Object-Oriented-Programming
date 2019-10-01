//Constructor overloading

class OOP
{

	OOP(String sub)
	{
	//sub = "OOP;
	System.out.println("This is an "+sub+" class.");
	}
	
	OOP(Boolean sub)
	{System.out.println("Is this a good class? " + sub);}
	
	OOP(int sub)
	{System.out.println("Number of students = " + sub);}
}

public class Demo
{
public static void main(String args[])

{
	OOP ob = new OOP("OOP");
	OOP ob1 = new OOP(true);
	OOP ob2 = new OOP(96);
}
}
