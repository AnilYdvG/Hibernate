package logical;

import java.util.Arrays;

class Add2Array 
{
	public static void check(int[]a,int[]b)
	{
		int [] res=new int[a.length+b.length];
		System.out.println(Arrays.toString(res));
		int x=0,y=0;
		for(int i=0;i<=res.length-1;i++)
		{
			if(i<a.length)
			{
				res[i]=a[x];
				x++;
			}
			else
			{
				res[i]=b[y];
				y++;
			}
//			System.out.print(res[i]+" ");
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5};
		int [] b= {6,7,8};
		check(a,b);
	}
}

//Inbuilt method
class Add2Array1
{
	public static void check(int[]a,int[]b)
	{
		int [] res=new int[a.length+b.length];
		int x=0,y=0;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5};
		int [] b= {6,7,8};
		check(a,b);
	}
}


class Add2ArrKey
{
	public static void check(int[]a,int[]b,int k)
	{
//		int [] res=new int[k+b.length];
		int [] res=new int[a.length+b.length];
		int x=0,y=0;
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		for(int i=0;i<=res.length-1;i++)
		{
			if(i<k)
			{
				res[i]=a[x];
				x++;
			}
			else if(i<(k+b.length))
			{
			
				res[i]=b[y];
				y++;
			}
			else
			{
				res[i]=a[x];
				x++;
			}
			
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5};
		int [] b= {6,7,8};
		int k=1;
		check(a,b,k);
	}
}


class Shift0ToRight
{
	public static int[] shift(int[] a,int n)
	{
		int [] b=new int[n];
		int x=0;
		for(int i=0;i<=n-1;i++)
		{
			if(a[i]!=0)
			{
				b[x]=a[i];
				x++;
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		int [] a= {1,0,0,0,2,0,3};
		int n=7;
		System.out.println(Arrays.toString(shift(a,n)));
		
	}
}