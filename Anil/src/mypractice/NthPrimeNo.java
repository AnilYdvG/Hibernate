package mypractice;

import java.util.Scanner;

public class NthPrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth prime number u want");
		int q=sc.nextInt();
		int n = 0;
		int count = 0;
		int num=0;
		for(int i=2;i<=10000;i++)
		{
			for(int j = 2;j<=10000;j++)
			{
				if(i%j==0)
					count++;
				
				if(count==1)
				{
					n++;
					num=i;
				}
				
			}			
		}
		if(q==n)
		
			System.out.println(num);;
			
		

		System.out.println("hi");
		sc.close();
		
		
	}

}
