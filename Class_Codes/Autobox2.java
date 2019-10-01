class AutoBox2
{
	static int mat(Integer v)
	{
		return v;
	}

	public static void main(String[] args)
	{
		Integer j1 = mat(15);   //boxing happens here as mat return an int value to reference Integer
		//int i = 15;
		System.out.println(j1);
	}
}
