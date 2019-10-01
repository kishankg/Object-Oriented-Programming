class A
{
 int x = 10;
}

class B extends A
{
 int x = 20;
 int y = 87;
}

public class Polymember
{
	public static void main(String[] args)
	{
	A a = new B(); //object of type B
	System.out.println(a.x);  //data member of A is accessed
	//can't access data member of B
	System.out.println(a.y); //gives an error
	}

}
