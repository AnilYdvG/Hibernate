package logical;

import java.util.Scanner;

public class Intrvw1 
{
	public static boolean matchNum(int n)
	{
		Scanner sc = new Scanner(System.in);
		int sq = n*n;
		int count = 0;
		int m = sq;
		int h1 = 0;
		while(sq>0)
		{
			sq/=10;
			count++;
		}
		for(int i=1; i<=count/2 ;i++)
		{
			int rem = m%10;
			h1*= 10+rem;
			m/= 10;
		}
		if(h1+m == n)
			return true;
		else
		{
			int rem = m%10;
			h1*= 10+rem;
			m/= 10;
			if(h1+m == n)
				return true;
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(matchNum(2205));
		
	}

}
