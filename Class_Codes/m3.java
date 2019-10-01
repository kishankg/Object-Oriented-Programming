class Maruti {
	int no_of_airbags;
	double mileage;
	
	void setInfo(int n, double m)
	{
		no_of_airbags=n;
		mileage=m;
	}
	
	void display() 
	{
		System.out.println("  no. of airbags = "+no_of_airbags+ " mileage = "+mileage);
	}
}
class m3 
{
	public static void main(String args[]) 
	{
		Maruti ciaz = new Maruti();
		Maruti baleno = new Maruti();
		ciaz.setInfo(2,12.5);
		ciaz.display();
		baleno.setInfo(1,14);
		baleno.display();
	}
}	
  