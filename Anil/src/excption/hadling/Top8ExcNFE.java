package excption.hadling;

import java.util.Scanner;

public class Top8ExcNFE 
{
	public static void main(String[] args) 
	{
		int n;
			Scanner s = new Scanner(System.in);
			
			while(true)
			{
				System.out.println("Enter the number");
				try 
				{
					n=Integer.parseInt(s.next());
					System.out.println("You entered "+n);
					break;
				}
				catch(NumberFormatException e)
				{
					System.out.println("NumberFormatException");
				}
			}
		
	}

}
