package excption.hadling;

public class FinllyRetrnStmt 
{
	@SuppressWarnings("finally")
	public static int m1()
	{
		try 
		{
			System.out.println("Hi....");
			return 777;			
		}
		catch (Exception e) 
		{
			return 888;
		}
		finally
		{
			System.out.println("Hello...");	
			return 999;								//finally block return stmt will get 1st priority
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(m1());
				
	}

}
