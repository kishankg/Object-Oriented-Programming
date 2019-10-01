import java.io.*;

public class Read10
{

public static void main(String args[])
{
  char c;
  System.out.println("Enter character x to exit");
  BufferedInputStream br = new BufferedInputStream(System.in);

  //read characters
    boolean b = true;
    c = (char) br.read();

    while(b)
    {
      if(c=='x') break;
      System.out.println(c);
      c = (char) br.read();
    }
}
}
