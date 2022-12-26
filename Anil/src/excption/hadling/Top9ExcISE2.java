package excption.hadling;

public class Top9ExcISE2 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread();
		t.start();
		
		try
		{
			System.out.println("Thread is going to sleep");
			t.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Main thread");
		
		t.start();			//can't Re-start thread
	}

}
