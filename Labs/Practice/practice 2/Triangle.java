public class Triangle
{
	private int base;
	private char colour;
	private int height;

	public Triangle(int height,int base, char colour)
	{
		this.height = height;
		this.base = base;
		this.colour = colour;
	}

	public int getArea()
	{
		return (height*base)/2;
	}

	public char getColour()
	{
		return colour;
	}
}