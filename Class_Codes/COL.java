
class BITS
{
	BITS()
	{
		System.out.println("This is an oop class");
	}
	
	BITS(Boolean a)
	{
		System.out.println("Is this a good class?  " +a);
	}
	
	BITS(int a)
	{
	System.out.println("Give the number of students in this class : " +a);
	}
}
	
	public class col
	{
		public static void main(String args[])
		{
			BITS x = new BITS();
			BITS y = new BITS(true);
			BITS z = new BITS(96);
					
		}
	}
	