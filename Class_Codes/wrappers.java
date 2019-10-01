class wrappers
{
	public static void main(String[] args)
	{
	//Character ch1 = "q";
	//Character ch2 = "q"; autoboxing
	char ch = 'q';
	Character ch3 = new Character(ch); //boxing
	int i = 2;
	float f = 2.34f;
	//Integer i1 = "2"; //autoboxing not valid for string type argument
	//Integer i1 = ("2");
	Integer i2 = (2);
	Integer i4 = new Integer(10); //boxing
	//Integer i5 = new Integer("ajsf"); //??? error - numberformat exception
	Float f4 = new Float(1.02f); //boxing

	System.out.println(ch3.charValue()); //unboxing
	System.out.println(i4.intValue());
	System.out.println(f4.floatValue());
	System.out.println(i4.floatValue());
	}
}
