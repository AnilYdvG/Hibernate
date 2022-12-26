package logical;

class PrimeNum 
{
	public static void isPrime()
	{
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}				
			}
			if(count==0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		isPrime();	
	}
}


class CheckPrime1
{
	public static void prime(int n)
	{
		int count = 0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" --> not a prime");
				count++;
				break;
			}
		}
		if(n>1&&count==0)			// this logic is not showing  that 1 is not a prime
			System.out.println(n+" --> prime");
	}
	public static void main(String[] args) 
	{
		prime(11);
	}
}

class CheckPrime2
{
	public static void prime(int n)
	//	public static String prime(int n)
	{

		//		int count = 0;
		boolean b1=false;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				//				count++;
				b1=true;
			}
		}
		//		if(n>1&&count==0)
		if(n>1 && b1==false)
			System.out.println(n+" --> prime");
		//		return "Prime";
		else System.out.println(n+" --> not a prime");
//			return "not prime";

	}

	public static void main(String[] args) 
	{
		prime(11);
		//		System.out.println(prime(11));

	}
}


class CheckPrime3
{
	public static String check(int n)
	{
		int i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is divisibe by "+i);
				return "not a prime";
			}
		} 
		System.out.println(i);
		return "Prime number";
	}
	public static void main(String[] args) 
	{
		System.out.println(check(13));

	}
}

// nth prime number?

class NthPrime
{
	public static int nthPr(int n)
	{
		
		int c2=0;
		int i;
		for(i=2;i <=100;i++)
		{
			int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
				c2++;
			if(c2==n)
				break;
		}
		return i;
	}
	public static void main(String[] args) 
	{
		System.out.println(nthPr(10));
		
	}
}


class PrimeBetween1ToN
{
	public static void printPrime(int N)
	{
		for(int i=2;i<=N;i++)
		{
			int count = 0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j == 0)
					count++;
			}
			if(count == 0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		printPrime(100);
	
		
	}
}



class IsPrimeTimeComplxty 			//O(sqrtN)			doesn't work
{
	public static int isprime(int N)
	{
		for(int i=2;i<=Math.sqrt(N);i++)
		{
			if(N%i==0)
			 return 1;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		System.out.println(isprime(5));
		
	}
}