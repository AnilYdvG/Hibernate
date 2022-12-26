package multithreading;

public class WithoutExtendingThread 
{
	public static void main(String[] args) throws InterruptedException 
	{
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(1000);
//			System.out.println(i+" "+Thread.currentThread().getName());
			Thread.currentThread().setName("Anil");
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

}
