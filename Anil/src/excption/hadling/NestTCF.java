package excption.hadling;

public class NestTCF 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("1st Outer try block");
//			System.out.println(10/0);
			System.out.println("2nd Outer try block");
			try
			{
				System.out.println("Inner try block");
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Inner catch block");
//				System.out.println(20/0);
			}
			finally
			{
				System.out.println("Inner finally");
			}
			System.out.println("After Inner catch block");
		}
		catch(Exception e)
		{
			System.out.println("Outer catch block");
//			System.out.println(10/0);
		}
		finally
		{
			System.out.println("outer Finally block");
		}
		System.out.println("After outer Finally block");
	}

}
