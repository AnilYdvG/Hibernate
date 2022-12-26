package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubArray 
{
	public static ArrayList<Integer> subArray(int[]arr,int p,int n)
	{
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int a=1,b=0,x=0,s=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			s+=arr[i];
			if(s==p)
			{
				b=i;
				break;
			}
			if(s>p)
			{
				a++;
				i=x;
				x++;
				s=0;
				continue;
			}
		}
		
		if(s==p && s!=0)
		{
			b++;
//			int [] res= {a,b};
//			return res;
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(a);
			al.add(b);
			return al;
		}
		else
		{
//			int [] res= {-1};
//			return res;
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(-1);
			return al;
		}		
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=s.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the sum value");
		int p=s.nextInt();
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
//		System.out.println(Arrays.toString(subArray(arr,p)));
		ArrayList a=subArray(arr,p,n);
		for(Object a1:a)
		{
			System.out.println(a1);
		}
	}
}
