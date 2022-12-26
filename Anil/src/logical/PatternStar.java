package logical;

class HollowRect			//HollowStar
{
	public static void hollowStar(int n,int m)  //for square pattern m=n
	{	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||i==n||j==1||j==m)
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		hollowStar(5,10);		
	}
}




class HalfPyramid			//Half pyramid
{
	public static void halfPyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		halfPyramid(5);
	}
}




class HalfPyramid_1
{
	public static void halfPyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		halfPyramid(5);
	}
}



class HalfPyramidmirr
{
	public static void halfPyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		halfPyramid(5);
	}
}





class InvertedHalfPyramid_1
{
	public static void invertedHalfPyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");

			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		invertedHalfPyramid(5);
	}
}



class InvertedHalfPyramidMirr
{
	public static void invertedHalfPyramid(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		invertedHalfPyramid(5);
		
	}
}


