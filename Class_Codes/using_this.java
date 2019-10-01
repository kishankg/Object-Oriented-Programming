class Maruti {
	int no_of_airbags;
	double mileage;
	
		Maruti(int no_of_airbags, double mileage) 
	{
		this.no_of_airbags = no_of_airbags;
		this.mileage = mileage;
		System.out.println(" in local constructor: no. of airbags = "+no_of_airbags+ " mileage = "+mileage);		
	}

	void display() 
	{
		System.out.println(" in class: no. of airbags = "+no_of_airbags+ " mileage = "+mileage);
	}
}
class using_this 
{
	public static void main(String args[]) 
	{
		//Maruti ciaz = new Maruti();
		Maruti ciaz = new Maruti(2,12.5);
		ciaz.display();
	}
}	
  