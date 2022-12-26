package excption.hadling;

import java.util.Scanner;

public class ThrwMarriage 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Type your age");
		int age = s.nextInt();
											//to write e.getMessage()-->catch block is req.
		ThrwTooOldException o = new ThrwTooOldException("Too old to marry");
		ThrwMTooYoungException y = new ThrwMTooYoungException("Too young to marry");
		if(age>60)
		{
//			throw new ThrwTooOldException("Too old to marry");
//			throw o;
			try 
			{
//				throw new ThrwTooOldException("Too old to marry");
				throw o;											//can't write any stmt after throw stmt	
			}
			catch(ThrwTooOldException e)
			{
				System.out.println("Age is gone now");
				System.out.println(e.getMessage());
			}
		}
		else if(age<18)		//Exception not handled
		{
//			throw new ThrwMTooYoungException("Too young to marry");
			throw y;
			
		}
		else
		{
			System.out.println("Eligible to marry");
		}
	}

}
