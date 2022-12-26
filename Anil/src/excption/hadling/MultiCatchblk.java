package excption.hadling;

public class MultiCatchblk 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a[]=new int[5];
			a[2]=10/0;
			a[8]=10;
			String s=null;
			System.out.println(s);
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException e)		//in multicatchblock,exceptions should not be in relationship
		{
			System.out.println("exception is there");
		}
		
	}

}
