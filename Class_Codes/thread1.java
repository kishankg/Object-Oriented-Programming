class oop implements Runnable
{
 	public void run()
 	{
 	  try
 	  {
 		   for (int i = 5; i > 0; i--)
 			   {
 			       System.out.println("Child thread " + i);
 			       Thread.sleep(1000);
 			   }
 	  }

   	catch(InterruptedException e)
   	{
   		System.out.println("Child interrupted");
   	}

    System.out.println("Exiting child thread");
 	}

 	public void display()
 	{
 	  System.out.println("Hi");
 	}

 	public void display2()
 	{
 	  System.out.println("Hello");
 	}
}

public class thread1
{
	public static void main(String[] args)
	{
	oop t1 = new oop();
	Thread t = new Thread(t1);
  //System.out.println("Child thread" + t);
	t.start();
	System.out.println("Child thread Print " + t);
	t1.display();

	try
 		{
 		for (int i = 5; i > 0; i--)
 			{
 			System.out.println("Main thread " + i);
 			Thread.sleep(1000);
 			}
 		}

 	catch(InterruptedException e)
 		{
 		System.out.println("Main thread interrupted");
 		}
 	System.out.println("Exiting main thread");
 	}




}
