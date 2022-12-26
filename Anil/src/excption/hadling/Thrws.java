package excption.hadling;

public class Thrws 
{
	void m1() throws Exception		//to deligate responsibility of the exception handling to the caller
	{								
		System.out.println(10/0);
	}
	void m2() throws ArithmeticException
	{
		System.out.println(20/0);
	}
	public static void main(String[] args) 
	{
		System.out.println("HI...");
		Thrws t = new Thrws();
		try 
		{
			t.m1();
		} 
		catch (Exception e) 
		{
			System.out.println(10/2);
		}
		try
		{
			t.m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println(20/5);
		}
		
	}
}
