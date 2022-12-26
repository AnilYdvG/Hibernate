package mypractice;

public class Array1 
{
	public static void main(String[] args) 
	{
//		int[] a= new int[5];			//way 1---declaration n initialisation of array 
//		int a[]= new int[5];				//way 2---declaration n initialisation of array 
//		int a[]= {1,10,'a','B',(int)55.5};			//way 3---declaration n initialisation of array 
		int a[]=new int [] {1,10,'a','B',(int)55.5};		//	way 4---declaration n initialisation of array 
		a[0]=1;
		a[1]=10;
		a[2]='a';
		a[3]='B';
		a[4]=(int)55.5;
		System.out.println(a);
		
		
		for(int i=0;i<a.length;i++)			//way 1---printing array element
			System.out.print(a[i]);
		
		System.out.println("===========");
		
		int i=0;
		for(;i<a.length;i++)			//way 2---printing array element
			System.out.print(a[i]+" ");
				
		
		System.out.println("-------------");			
		
		
		for(int j: a)						//way 3---printing array element
			System.out.print(j+" ");
		
		
		
	}


}
