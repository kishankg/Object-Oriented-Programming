class Maruti {
	int no_of_airbags=1;
	double mileage=12.5;
	
	
	void display() 
	{
		System.out.println("  no. of airbags = "+no_of_airbags+ " mileage = "+mileage);
	}
}
class m1 
{
	public static void main(String args[]) 
	{
		Maruti ciaz = new Maruti();
		Maruti baleno = new Maruti();
		ciaz.display();
	}
}	
  