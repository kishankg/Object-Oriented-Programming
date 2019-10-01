class Honda
{
	void display()
	{System.out.println("Forget the toys ");}

}

class Amaze extends Honda
{
	void display()
	{System.out.println("Amazing");}

}

class City extends Amaze
{
	void display()
	{System.out.println("City best  ");}

}

public class Demo4
{
	public static void main(String[] args)
	{
	Honda a = new Honda();
	Amaze b = new Amaze();
	City c = new City();
	
	//reference variable of  Honda type
	Honda h;
	
	h = a; //h refers to honda object
	
	//calling Honda's version of display
	h.display();
	
	h = b;
	h.display();
	
	h = c;
	h.display();	 
	
	//This repeated reference to a, b and c by h is dynamic dispatching
	}
}













