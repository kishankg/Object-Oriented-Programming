
class oop
{
	int id;
	String name;
	oop(int i, String n)
	{
	id = i;
	name = n;
	}
	oop (oop o)
	{
	id = o.id;
	name = o.name;
	} 
	void display()
	{
	System.out.println(id+" " +name);
	}
}
class cbc
{
	public static void main(String args[])
	{
	oop s1 = new oop (96,  "Anita");
	oop s2 = new oop(s1);
	//s1.id = 1;
	
	s1.display();
	s2.display();	
	}
	
	
}
