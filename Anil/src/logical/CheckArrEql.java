package logical;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrEql 
{
	public static boolean check(int[]arr1,int[]arr2)
	{
		if(arr1.length!=arr2.length)
			return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Size of 2 Arrays");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int [] a=new int[n1];
		int [] b=new int[n2];
		System.out.println("Enter 1st array elements");
		for(int i=0;i<=n1-1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter 2nd array elements");
		for(int i=0;i<=n2-1;i++)
		{
			b[i]=s.nextInt();
		}
		System.out.println(check(a,b));
			
		
	}

}
