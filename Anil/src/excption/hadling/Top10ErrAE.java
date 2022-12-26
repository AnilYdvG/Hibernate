package excption.hadling;

import java.util.Scanner;

public class Top10ErrAE 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur age");
		int age = s.nextInt();
		assert age>=18:"Not valid";			//by default Assertion is disabled--->will not give error
											//to activate -ea is reqd while running pgm
		
		System.out.println("Age is "+age);
		
	}

}
