package com.anil.a1;

public class MLoadingCalculator 
{
	void square(int n)
	{
		int res = n*n;
		System.out.println("Square of ur value is "+res);
	}
	
	void square(double n)
	{
		double res = n*n;
		System.out.println("Square of ur value is "+res);
	}
	void sum(int... arg)		//by doing var-args method,it will consider it as array
	{
		System.out.println("finding sum of "+arg.length+" parameters");
		int res = 0;
		for(int i=0;i<=arg.length;i++)
		{
			res = res+arg[i];
		}
		System.out.println("Sum value is: "+res);
	}
//	void sum(int n1,int n2,int n3)
//	{
//		int res = n1+n2+n3;
//		System.out.println("Sum of ur intput 3 values is "+res);
//	}

}
