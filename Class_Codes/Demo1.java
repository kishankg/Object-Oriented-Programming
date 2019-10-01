//main overloading

public class Demo1
{
	//normal main
	public static void main(String[] args)
	{
		System.out.println("Hi1");
	main("abc");
}


//overloaded main
	public static void main(String arg1)
	{
		System.out.println("Hi2" + arg1);
		main("Dear abc", "Myabc");
}


	public static void main(String arg1, String arg2)
	{
		System.out.println("Hi3" + arg1 + "," + arg2);
	}
}
