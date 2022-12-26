package logical;

import java.util.Arrays;
import java.util.Scanner;

class Shift0TOleft 
{
	public static int[] shiftToLeft(int[]arr)
	{
		int [] b=new int[arr.length];
		int x=b.length-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				b[x]=arr[i];
				x--;
			}
		}
//		System.out.println(Arrays.toString(b));
		return b;
	}
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,0,0,5,0};
		System.out.println(Arrays.toString(shiftToLeft(arr)));
		
	}

}



class ShiftEvenToRight			//we'll get the result in reverse order
{
	public static int[] shiftEvenRight(int []arr)
	{
		int [] b= new int[arr.length];
		int x=b.length-1;
		int y=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==0)
			{
				b[x]=arr[i];
				x--;
			}
			else 
			{
				b[y]=arr[i];
				y++;
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		int [] arr= {1,4,7,2,8,4,9};
		System.out.println(Arrays.toString(shiftEvenRight(arr)));
	}
}

class ShiftEvenToleft    //in insertion order
{
	public static int[] shiftEvenLeft(int [] arr)
	{
		int [] b=new int[arr.length];
		int x=0,y=arr.length-1,m=arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				b[x]=arr[i];
				x++;
			}
			if(arr[y]%2!=0)
			{
				b[m]=arr[y];
				m--;
			}
			y--;
		}
		return b;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=s.nextInt();
		System.out.println("Enter elements");
		int [] arr=new int[n];
		for(int i=0;i<=n-1;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(shiftEvenLeft(arr)));
	}
}



class ShiftEvenToRight1
{
	public static int[] shiftEvenRight(int []arr)
	{
		int [] b= new int[arr.length];
		int x=0;
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[j]%2==0)
				{
					b[x]=arr[j];
					x++;
				}	
			}
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]%2 != 0)
				{
					b[x]=arr[i];
					x++;
				}
			}
		return b;
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=s.nextInt();
		int [] arr= new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<=n-1;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(shiftEvenRight(arr)));
		
	}
}
















