class Car
{
boolean auto_gear;
int speed;

	Car(boolean auto_gear,int speed)
	{
	this.auto_gear = auto_gear;
	this.speed = speed;
	}

	void decelerate(int decrement)
	{
	speed -= decrement;
	}

	void accelerate(int increment)
	{
	speed -= increment;
	}

	String toDisplay()
	{
	return ("auto? " + auto_gear + "\n" + "speed " + speed);
	}

}

class Sedan extends Car
{
	int Tele_tilt;
	static int carLength;

	Sedan(boolean auto_gear,int speed,int Tele_tilt, int carLength)
	{
	super(auto_gear,speed);
	this.Tele_tilt = Tele_tilt;
	this.carLength = carLength;
	}


	void setTilt(int newValue)
	{
	this.Tele_tilt = newValue;
	}

	String toDisplay()
	{
	return (super.toDisplay() + "\n" + "Tele_tilt " + Tele_tilt);
	}

}


class Hatchback extends Sedan
{
	static int carLength;

	Hatchback(boolean auto_gear,int speed,int Tele_tilt, int carLength)
	{
	super(auto_gear,speed,Tele_tilt);
	//this.Tele_tilt = Tele_tilt;
	this.carLength = carLength;
	}

	void setcarLength(int value)
	{
	this.carLength = value;
	}

	String toDisplay()
	{
	return (super.toDisplay() + "carLength " + carLength);
	}

}

//driver class
public class Demo3
{
	public static void main(String[] args)
	{
	Car car1 = new Sedan(false,80,2);
	Sedan car2 = new Sedan(true, 1000, 2);
	car2 = (Sedan) car1;

	System.out.println(car2.toDisplay());
	System.out.println(car1.toDisplay());
	car1.setTilt(1);

	//Hatchback car3 = new Hatchback();

	}
}
