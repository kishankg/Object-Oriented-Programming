/*class abc 
{
	public static void main(String[] args)
	{
	 short num1 = 20000;
	 short num2 = 16000;
	 short num3 = 4000;
	 byte A1 = 10;
	 byte A2 = 20;
	 byte sum = (byte) (A1 + A2);
	 int sum1 = num1 + num2 + num3;
	 System.out.println(sum + " " + sum1);
	 
	 int i = 2000790000;
	 //int j = 1108800000;
	 char b = 66;
	 //long sum = i + j;
	 //System.out.println(b);
	 char a = 'A';
	 int j = a;
	 //a = a + 1; incompatible data types
	 //a = (char)(a+1);
	 //a += 1;  //no error here as in a = a+1
	 a++;
	 System.out.println(a + " " + j);
	 
	 }
}
*/

import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            // for(int j=0;j<3;j++)
            {
                int len = s1.length();
                int diff = (15 - len);
                System.out.print(s1);
                // printing the whitespaces
                while (diff-- > 0)
                    System.out.print(" ");
                // printing the numbers
                if (x < 10)
                    System.out.println("00" + x);
                else if ((x > 9) && (x < 100))
                    System.out.println("0" + x);
                else
                    System.out.println(x);
            }
            
        }
        System.out.println("================================");
    }
}

