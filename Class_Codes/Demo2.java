class A
{
	private static int w = 1;
	private int x = 2;
	static int y = 3;
	int z = 4;

	void dim()
	{
		//accessing variables of B in A
		B obj = new B();
		obj.z1 = 45023;
		System.out.println("z1 = " + obj.z1);
		B.y1 = 460;
		System.out.println("y1 = " + B.y1);
	}

//inner nested class
	static class B
	{
		private static int w1 = 10;
		private int x1 = 20;
		static int y1 = 30;
		int z1 = 40;

			static   //enclose static variables in static block to change their values
			{
			w = 100;
			y = 200;
			}

			/*A ob11 = new A();
			ob11.x = 14503;*/    //generates error - can't acces outside of a function?

		void display()
		{
			System.out.println("w = " + w);
			System.out.println("y = " + y);
			//accessing non-static variables of A in B
			A ob3 = new A();
			ob3.x = 200;
			ob3.z = 4000;
			System.out.println("x = " + ob3.x);
			System.out.println("z = " + ob3.z);
		}

	}
}

public class Demo2
{

	public static void main(String args[])
	{
	//A.w = 11;
	//System.out.println("w = " + A.w);  //gives error as w is a private variable and can't be accessed in main

	A ob1 = new A();
	ob1.z = 11;
	System.out.println("z = " + ob1.z);

	A.y = 15;
	System.out.println("y = " + A.y);

	//creating object of class B
	A.B ob2 = new A.B();
	ob2.display();

	//accessing inner class (B) variables in main
	A.B ob4 = new A.B();
	//ob4.z1 = 45;
	//A.B.y1 = 37;
	//System.out.println("z1 = " + ob4.z1);
	//System.out.println("y1 = " + A.B.y1);

	A ob10 = new A();
	ob10.dim();

	//calling inner class object in main
	//A o1 = new A();
	//A.B o34 = o1.new B();
	//o34.display();
	}

}
