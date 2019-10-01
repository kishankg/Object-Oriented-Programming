
class oop
{
	int id;
	String name;
	oop(int i, String n)
	{
		id =i;
		name = n;
	}
	oop()
	{
	}
	void display()
	{
	System.out.println(id+" "+name);
	}
}
public class cwc
{
	public static void main(String args[])
	{
		oop s1 = new oop(96,"Amreen");
		oop s2= new oop();
		s2.id = s1.id;
		s2.name= s1.name;
		s1.display();
		s2.display();
	}
}

