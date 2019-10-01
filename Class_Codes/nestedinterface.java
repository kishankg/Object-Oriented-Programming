interface Honda
{ 
//protected interface autocar extends Honda - wrong as we can't change access to interface, public by default
interface autocar
	{
	//protected void print();  error again for same reason
	void print();
	}
}



public class nestedinterface
{
	public static void main(String[] args)
	{
		City c1 = new City();
		c1.show();
		c1.print();
	}
	
}
