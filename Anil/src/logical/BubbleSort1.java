package logical;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort1 
{
	public static int[] sort(int[]a)
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			for(int j=0;j<=a.length-2;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println(i);
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n=s.nextInt();
		System.out.println("Enter Elements of array");
		int[] arr=new int[n];
		for(int i=0;i<=arr.length-1;i++)
			arr[i]=s.nextInt();
		System.out.println(Arrays.toString(sort(arr)));
	}

}
