interface autocar
{
	void print();
	//void print1()  // this gives an error as it is not implemented anywhere
}

interface Honda extends autocar
{
	static void print()  //default method can be defined
	{
	System.out.println("This is a Honda autocar");
	}
	//print method is present in all interfaces and classes but output is of class print()  method only as it is method overriding (example of default method overriding). To get output of this interface we use name of interface and super in driver class.


	void show();
	//void print();   //Not an error?? Gives an error. Can't write it here as Honda is an interface too and has no implementation of that method
}

class City implements autocar, Honda   //multiple inheritances
{
	static void print()
	{
	System.out.println("This is an auto car");
	//Honda.super.print();   //to get output of interface print() method
	}

	public void show()
	{
	System.out.println("This is a Honda car");
	}
}

public class interfaces1
{
	public static void main(String[] args)
	{
		City c1 = new City();
		c1.show();
		c1.print();
	}

}
