class Newthread extends Thread
{
//entry point for second thread
	public void run()
 	{
	 	try
	 	{
	 		for (int i = 5; i > 0; i--)
	 		{
	 			System.out.println("Child thread " + i);
	 			Thread.sleep(500);
	 		}
	 	}

 		catch(InterruptedException e)
 		{
 			System.out.println("Child interrupted");
 		}

		System.out.println("Exiting child thread");
 	}
}



class ExtendThread
{
	public static void main(String[] args)
	{
	Newthread nt = new Newthread();
	nt.start();

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
