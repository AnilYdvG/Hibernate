package logical;

class Repeat2 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i=1;i<=30;i++)
		{
			int rem=i%10;
			int num=i/10;
			if(rem==2)
				count++;
			if(num==2)
				count++;
		}
		System.out.println(count);

	}
}

class Repeat2threeDigits
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=0;i<=300;i++)
		{
			int n=i;
			while(n>0)
			{
				
			}
		}
		
	}
	
}
