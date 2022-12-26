package star;

class Pattern1 
{
	public static void printStar(int n)
	{
		//upper half
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*n);j++)
			{
				//left side
				if(i>(n-j+1))
					System.out.print(" ");
				else System.out.print("*");
				
				//right side
				if(j<(i+n))
					System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
		//lower half
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n;j++)
			{
				//right 
				if(i<j)
					System.out.print(" ");
				else System.out.print("*");
				
				//left
				if(i<=((2*n)-j))
					System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		printStar(n);
		
	}

}
