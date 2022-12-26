package excption.hadling;

public class CtrlFlowTCF 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/5);
//			System.out.println(10/0);
			System.out.println("Hi...");

		}
		catch(Exception e)
		{
			System.out.println(10/2);
//			System.out.println(10/0);
			System.out.println("Bye...");

		}
		finally
		{
			System.out.println(20/5);
//			System.out.println(20/0);
			System.out.println("Hello...");

		}
		System.out.println(60/3);
//		System.out.println(60/0);
				
	}

}
