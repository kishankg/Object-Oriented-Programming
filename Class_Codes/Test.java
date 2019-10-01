import java.util.*;
import java.lang.*;
//import java.package.*;
import java.io.FileWriter;
import java.io.IOException;
public class Test
{
  public static void main(String args[]) throws IOException
  {
    FileWriter fr = new FileWriter("Read.txt");

    Scanner sc = new Scanner(System.in);

    while(sc.hasNext())
    {
      if(sc.nextInt()==1) break;
      fr.write(sc.next());
    }
    fr.close();
  }
}


/*
int decval = 123;
int octval = 07;
int hexval = 0x123;
int bin = 0b10101;

float f = 3.14; //error
float f = 3.14f;
*/
