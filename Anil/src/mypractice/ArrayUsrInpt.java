package mypractice;

import java.util.Scanner;

public class ArrayUsrInpt 
{
	public static void main(String[] args) 
	{
		int size=5;
		int a[]= new int[size];
		Scanner Ip = new Scanner(System.in);
		
		for(int i=0;i<size;i++)
			a[i]=Ip.nextInt();
		
//		for(int i:a)
//			System.out.println(i+" ");
		
	}

}
