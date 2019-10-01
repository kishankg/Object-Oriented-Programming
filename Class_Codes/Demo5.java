abstract class vessel
{
double contents;
abstract double capacity();
	void fill(double quantity)
	{
	contents = Math.min(contents + quantity, capacity());
	System.out.println(contents);
	//return contents;
	}
}

class tank extends vessel
{

	double length, width, height;

	//constructor
	tank(double length, double width, double height)
	{
	this.length = length;
	this.width = width;
	this.height = height;
	}

	public String toString()
	{
	return ("tank ( " + length + " " + width + " " + height+" )");
	}

	double capacity()
	{
	return length*width*height;
	}
}
	//tank-inherited class cube
	class cube extends tank
	{
		double side;
		//constructor with side using super
		cube(double side)
		{
			super(side,side,side);
		}
		//toStringmethod
		public String toString()
		{
		return ("cube ( " + side + " " + side + " " + side +" )");
		}
	}

class barrel extends vessel
{
	double radius, height;

	//constructor with radius and height
	barrel(double radius, double height)
	{
	this.radius = radius;
	this.height = height;
	}

	//capacity with area
	double capacity()
	{
	return 3.14*radius*radius*height;
	}

	//toString method
	public String toString()
	{
	return ("barrel ( " + radius + " " + height+" )");
	}
}

public class Demo5
{
	public static void main(String args[])
	{
	vessel v1 = new tank(10,20,30);
	vessel v2 = new barrel(12,15);
	vessel v3 = new cube(14);
	//v2 is barrel and v3 is cube
	v1.fill(18);
	v2.fill(16);
	v3.fill(17);
	System.out.println("Vessel 1 " + v1);
	System.out.println("Vessel 2 " + v2);
	System.out.println("Vessel 3 " + v3);
	v1.toString();
	//sopln for v2 and v3
	}
}
