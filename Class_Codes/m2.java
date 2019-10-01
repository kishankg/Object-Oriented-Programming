class Maruti {
	int no_of_airbags;
	double mileage;
	
	
	void display() 
	{
		System.out.println(" no. of airbags = "+no_of_airbags+ " mileage = "+mileage);
	}
}
class m2 
{
	public static void main(String args[]) 
	{
		Maruti ciaz = new Maruti();
		Maruti baleno = new Maruti();
		ciaz.no_of_airbags=2;
		ciaz.mileage=12.5;
		ciaz.display();
		baleno.no_of_airbags=1;
		baleno.mileage=14;
		baleno.display();
		
	}
}	
  