package logical;

import java.util.ArrayList;

public class StorPrimeInArray 
{
	public static void isPrime(int N)
	{
		ArrayList<Integer> l = new ArrayList<>();
//		int [] arr = {};
		
		for(int i=2;i<=N;i++)
		{
			int count = 0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
					count++;
				
			}
			if(count==1)
			{
//				for(int k=0;k<=5;i++)
//				{
//					int arr[]= {i};
//					System.out.println(arr[k]);
					l.add(i);
//				}
			}
		}
		System.out.println(l);
		System.out.println(l.get(0));
		Object[] arr = l.toArray();
		for(int i=0;i<arr.length;i++)
		{
//			System.out.println(arr[i]);
			for(int j=1;j<=4;j++)
			{
				for(int k=1;k<=j;k++)
				{
					System.out.print(arr[i]);
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) 
	{
		isPrime(20);
				
	}

}
