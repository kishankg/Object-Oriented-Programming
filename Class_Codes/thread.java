class oop implements Runnable
{
	public void run()
	{
		try
		{
			for (int i = 5; i > 0; i--)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child interrupted");
		}
	}

}


public class thread
{
public static void main(String[] args)
	{
	oop t1 = new oop();
	Thread t = new Thread(t1);    // type 2 constructor as t1 is a runnable target
	//Thread t = new Thread(new oop());
	t.start();
	System.out.println("Child thread " + t);

	}
}
