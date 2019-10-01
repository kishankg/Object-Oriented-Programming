public class Shape
{
	private int squareCount;
	private Square[] squareList;
	private int triangleCount;
	private Triangle[] triangleList;

	public Shape()
	{
		triangleList = new Triangle[10];
		squareList = new Square[10];
		squareCount = 0;
		triangleCount = 0;
	}

	public int getSquareCount()
	{
		return squareCount;
	}

	public int getTriangleCount()
	{
		return triangleCount;
	}

	public boolean insertTriangle(Triangle triangle)
	{
		if(triangleCount>=10) return false;
		triangleList[triangleCount] = triangle;
		triangleCount++;
		return true;
	}

	public boolean insertSquare(Square square)
	{
		if(squareCount>=10) return false;
		squareList[squareCount] = square;
		squareCount++;
		return true;
	}

	public char getColourOfMaxSqaure()
	{
		char finalColour = 'N';
		int maxArea = 0;
		
		for(int i=0;i<squareCount;i++)
		{
			if(squareList[i].getArea()>maxArea)
			{
				maxArea = squareList[i].getArea();
				finalColour = squareList[i].getColour();
			}
		}

		return finalColour;
	}

	public char getColourOfMaxTriangle()
	{
		char finalColour = 'N';
		int maxArea = 0;
		
		for(int i=0;i<triangleCount;i++)
		{
			if(triangleList[i].getArea()>maxArea)
			{
				maxArea = triangleList[i].getArea();
				finalColour = triangleList[i].getColour();
			}
		}

		return finalColour;
	}

}