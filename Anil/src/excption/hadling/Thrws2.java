package excption.hadling;

public class Thrws2 
{
	public void m1() throws ArithmeticException		//write exception from child to parent always
	{
		System.out.println(10/0);
	}
	public void m2() throws Exception
	{
		System.out.println(20/0);
	}
	public void m3() throws Exception
	{
		System.out.println(0/0);
	}
	public static void main(String[] args) 
	{
		System.out.println("main() is the caller of this execution");
		System.out.println("So last Exception handler is main(),if no one handles the code inside");
		Thrws2 t = new Thrws2();
		try
		{
			t.m1();
		}
		catch(ArithmeticException e)
		{
			try 
			{
				t.m2();
			}
			catch(Exception e1)
			{
				try 
				{
					t.m3();
				}
				catch(Exception e2)
				{
					System.out.println(45);
				}
			}
		}
	}
}
