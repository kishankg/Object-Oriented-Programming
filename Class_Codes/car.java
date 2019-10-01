/* class maruti_suzuki
{
	String model;
	String type;
	float mileage;
	boolean auto_transmission;
	int airbags;
	
	public String show_info()
	{
	/*System.out.println(model);
	System.out.println(type);
	System.out.println(mileage);
	System.out.println(auto_transmission);
	System.out.println(airbags);*/
/*	
	return (model + " " + type + " " + mileage + " " + auto_transmission + " " + airbags);	
	}
}

public class car
{
	
	public static void main(String args[])
	{
	maruti_suzuki ob1 = new maruti_suzuki();
	maruti_suzuki ob2 = new maruti_suzuki();
	//maruti_suzuki ob3 = new maruti_suzuki();
	ob1.model = "Ciaz";
	ob1.type = "SUV";
	ob1.mileage = 21.21f;
	ob1.auto_transmission = true;
	ob1.airbags = 7;
	System.out.println(ob1.show_info());
	
	ob2.model = "Ciaz";
	ob2.type = "SUV";
	ob2.mileage = 21.21f;
	ob2.auto_transmission = true;
	ob2.airbags = 71;
	System.out.println(ob2.show_info());
	}
}
*/


class Maruti
{
/*int airbags = 2;
double mileage = 12.5;*/
int airbags;
double mileage;


//method
void showInfo()
{
System.out.println(airbags);
System.out.println(mileage);
}

void set(int n, double m)
{ 
airbags = n;  // in this programming memory needed is more for constructors and objects
mileage = m;
}

}

public class car
{
	public static void main(String[] args)
	{
	Maruti Baleno = new Maruti(); //creation of object leads to memory allocation. Drawback of this method is that user cannot set values of airbags and mileage.
	Maruti Ciaz = new Maruti();
	Baleno.airbags = 3;
	Baleno.mileage = 10.5;
	Ciaz.airbags = 2;
	Ciaz.mileage = 17.5;
	Baleno.showInfo();
	Ciaz.showInfo();
	Baleno.set(4,23.6);
	Ciaz.set(7,14.8);
	System.out.println(Baleno.airbags + " " + Baleno.mileage);
	System.out.println(Ciaz.airbags + " " + Ciaz.mileage);
	}
}















	


	
