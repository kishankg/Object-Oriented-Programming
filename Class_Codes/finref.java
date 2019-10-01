class OOP
{
	String s;
	OOP(String s1)
	{
	 s = s1;
	}
}
public class finref
{
	public static void main (String args[])
	{
		final OOP oop1 = new OOP ("Hi");
		OOP oop2 = new OOP ("Hello");
		oop1.s="hello all";
		//oop1=oop2;
		oop2=oop1;
		System.out.println(oop1.s);

	}
}
