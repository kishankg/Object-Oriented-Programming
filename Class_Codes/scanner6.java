//same as scanner5. Difference - picture
public class scanner6
{
  public static void main(String args[])
  {
    int i=1,j=1;

    try
    {
      i++;


      if(i/j > 1) i++;

      throw new Exception("Demo");
    }
    catch(ArithmeticException e)
    {
      System.out.println("0");
    }
    /*catch(FileNotFoundException e)
    {
      System.out.println("1");
    }*/
    catch(Exception e)
    {
      System.out.println(e);
      System.out.println("2");
    }
    finally
    {
      System.out.println("3");
    }
    System.out.println("4");
  }
}
