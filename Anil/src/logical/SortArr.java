package logical;

import java.util.Arrays;
import java.util.Scanner;

class SortArr 
{
	public static void main(String[] args) 
	{
		int [] a = {2,5,6,2,6,8,5,10};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i;j<=a.length-1;j++)
			{
				if(a[i]>=a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);		
		}		
	}
}

class SortByIndex
{
	public static int[] sortIndexWise(int [] a,int x)
	{
		for(int i=x;i<=a.length-1;i++)
		{
			for(int j=i;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Size of Array");
		int n=s.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<=n-1;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter index from where u want to sort");
		int i=s.nextInt();
		System.out.println(Arrays.toString(sortIndexWise(arr,i)));
	}
}











