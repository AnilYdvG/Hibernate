package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class EquillibriumPoint 
{
	public static int equi(int []a)
	{
		
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		System.out.println("Enter elements");
		int [] a=new int[n];
		for(int i=0;i<=n-1;i++)
			a[i]=s.nextInt();
		System.out.println(equi(a));
		
	}

}
