public class Triangle
{
	private int base;
	private static int countTriangle;
	private int height;

	public Triangle(int height,int base)
	{
		this.height = height;
		this.base = base;
	}

	public boolean isEnough()
	{
		if(countTriangle>=5) return true;
		else return false;
	}

	public boolean isEnough(int enoughNumber)
	{
		if(countTriangle>=enoughNumber) return true;
		else return false;
	}
}