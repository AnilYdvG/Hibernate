package excption.hadling;

public class TryCtch1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hi...");
		try 
		{
			System.out.println("Hello");
			System.out.println(10/0);			//after exception arises,it'll directly move to catch block
			System.out.println("How r u?");		//this stmt will not execute
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		System.out.println("Bye...");
		
	}

}
