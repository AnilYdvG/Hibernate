package logical;

public class CircularPrime 
{
	public static boolean cirPrime(int N)
	{
		int c=0;
		int t=N;
		while(t>0)
		{
			t/=10;
			c++;
		}
		for(int i=1;i<=c;i++)
		{
			for(int j=2;j<=N-1;j++)
			{
				if(N%j==0)
					return false;
			}
			int rem=N%10;
			int m1=N/10;
			int res = rem*(int)Math.pow(10, c-1)+m1;
			N=res;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(cirPrime(199));
		
	}

}



class RtrnNCirPrime
{
	public static boolean cirPrime(int N)
	{
		int c1=0;
		int c=0;
		int t=N;
		while(t>0)
		{
			t/=10;
			c++;
		}
		
		for(int i=1;i<=c;i++)
		{
			int c2=0;
			for(int j=2;j<=N-1;j++)
			{
				if(N%j==0)
					{
					c2++;
					continue;
					}
				
				
			}
			if(c2==0)
				c1++;
			int rem=N%10;
			int m1=N/10;
			int res = rem*(int)Math.pow(10, c-1)+m1;
			N=res;
		}
		if(c==c1)
		{
			System.out.println(c1);
			return true;
		}
		else
			{
			System.out.println(c1);
			return false;
			}
	}
	public static void main(String[] args) 
	{
		System.out.println(cirPrime(712));
		
	}

}