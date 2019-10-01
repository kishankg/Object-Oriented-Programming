public class Square
{
	private char colour;
	private int edge;

	Public Square(int edge,char colour)
	{
		this.edge = edge;
		this.colour = colour;
	}

	Public int getArea()
	{
		return edge*edge;
	}

	public char getColour()
	{
		return colour;
	}
}