public class SimpleCalc
{
	public SimpleCalc()
	{

	}

	float calculate(int firstOperand,int secondOperand, char operator)
	{
		if(operator=='+')
		{
			return float(firstOperand+secondOperand);
		}
		else if(operator=='-')
		{
			return float(firstOperand-secondOperand);
		}
		else if(operator=='*')
		{
			return float(firstOperand*secondOperand);
		}
		else
		{
			return (float)firstOperand/(float)secondOperand;
		}
	}

	public void typeCast(float value,char type)
	{
		if(type=='b')
		{
			System.out.printf("Byte: " + (byte)value);
		}
		else if(type=='c')
		{
			System.out.printf("Char: " + (char)value);
		}
		else if(type=='i')
		{
			System.out.printf("Int: "+ (char)value);
		}
		else
		{
			System.out.printf("Invalid type");
		}
		
	}
}