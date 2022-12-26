package logical;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter lenth of outer Array");
		int n=s.nextInt();
		System.out.println("Enter length of inner array");
		int m=s.nextInt();
		int [][] arr= new int[n][m];
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=m-1;j++)
			{
				System.out.println("Enter element at "+i+" index of outer array and inner array index "+j );
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
//			for(int j=0;j<=arr[i].length-1;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
			System.out.println(Arrays.toString(arr[i]));
			System.out.println();
		}
		
	}

}
