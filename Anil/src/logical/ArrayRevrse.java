package logical;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRevrse 
{
	public static int[] sort(int []a,int n)
	{
		int [] b=new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				b[i]=a[j];
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Array size");
		int n=s.nextInt();
		int [] arr=new int[n];
		System.out.println("Elements of array");
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=s.nextInt();
		System.out.println(Arrays.toString(sort(arr,n)));
	}

}
