package logical;

class CheckPrimeReduce 
{
	public static boolean checkPrimeReduce(int N)
	{
		int c=0;
		int temp=N;
		while(temp>0)
		{
			temp/=10;
			c++;
		}
//		for(int i=1;i<=c;i++)
		while(N>0)
		{
			for(int j=2;j<N;j++)
			{
				if(N%j==0)
					return false;
			}
			N/=10;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(checkPrimeReduce(31));
	}
}
