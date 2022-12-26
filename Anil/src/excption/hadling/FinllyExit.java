package excption.hadling;

public class FinllyExit 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Try");
			//shutting down JVM
			//System.exit dominates finally block--->finally block will not execute
			System.exit(0);		//-->System.exit(0)-->zero means Normal termination,...
									//System.exit(10)-->non zero means Abnormal termination
		}
		catch(Exception e)
		{
			System.out.println("Catch");
		}
		finally
		{
			System.out.println("Finally...");		// it will not execute
		}
		
	}

}
