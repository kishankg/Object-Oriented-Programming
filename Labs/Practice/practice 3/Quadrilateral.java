public class Quadrilateral
{
	private int[] edge;

	public Quadrilateral(int edge)
	{
		edge = new int[4];

		this.edge[0] = edge;
		this.edge[1] = edge;
		this.edge[2] = edge;
		this.edge[3] = edge; 
	}

	public Quadrilateral(int length,int breadth)
	{
		edge = new int[4];

		this.edge[0] = length;
		this.edge[1] = length;
		this.edge[2] = breadth;
		this.edge[3] = breadth; 
	}

	public Quadrilateral(int edge1,int edge2,int edge3,int edge4)
	{
		edge = new int[4];

		this.edge[0] = edge1;
		this.edge[1] = edge2;
		this.edge[2] = edge3;
		this.edge[3] = edge3; 
	}

	public int getPerimeter()
	{
		return edge[0]+edge[1]+edge[2]+edge[3];
	}

	public boolean equals(Quadrilateral quad)
	{
		return this.getPerimeter()==quad.getPerimeter();
	}

	public int hashCode()
	{
		return 17*37 + edge.hashCode();
	}
}