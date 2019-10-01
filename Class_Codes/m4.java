class Maruti {
	int no_of_airbags;
	double mileage;
	
	Maruti(int n, double m)
	{
		no_of_airbags=n;
		mileage=m;
	}
	
	void display() 
	{
		System.out.println(" no. of airbags = "+no_of_airbags+ " mileage = "+mileage);
	}
}
class m4 
{
	public static void main(String args[]) 
	{
		Maruti ciaz = new Maruti(2, 12.5);
		Maruti baleno = new Maruti(1,14);
		ciaz.display();
		baleno.display();
	}
}	
  