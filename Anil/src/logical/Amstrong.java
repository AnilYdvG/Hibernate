package logical;

public class Amstrong 
{
	public static boolean isAmstrong(int n)
	{
		int num=n;
		int temp=n;
		int n1=n;
		int sum=0;
		int count = 0;
		
		while(n1>0)
		{
			count++;
			n1/=10;			
		}
		while(num>0)
		{
			int rem = num%10;
			int p=1;
			for(int i = 1; i<=count;i++)
			{
				p=p*rem;
			}
			num=num/10;
			sum+=p;
			
		}
		if(sum==temp)
			return true;
		return false;
		
	}
	public static void main(String[] args) 
	{
		System.out.println(isAmstrong(153));
		
	}

}
