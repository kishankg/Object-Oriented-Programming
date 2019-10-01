//controlling the main thread
//EXAMPLE 1 03/04/2019

public class mainthread
{
public static void main(String[] args)
	{
	Thread t = Thread.currentThread();
	System.out.println("Current thread " + t);

	//change thread name
	t.setName("My thread");
	System.out.println("After name change" + t);

	try
		{
		for (int n = 5; n > 0; n--)
			{
			System.out.println(n);
			Thread.sleep(1000);
			}
		}
	catch (InterruptedException e)
	{
		System.out.println("Main thread interrupted");
	}
		System.out.println(t.getName());
	}
}
