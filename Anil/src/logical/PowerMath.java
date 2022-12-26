package logical;

class PowerMath 
{
	public static int mathPow(int n,int p)
	{
		int num=n;
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res*= num;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(mathPow(5,2));
		int res = (int)mathPow(3, 2);
//		System.out.println(res);
		
	}

}
class Armstrong
{
	public static void main(String[] args) {
		int num=153,count=0,prod=0;
		int temp=num;
		while(temp!=0)
		{
			temp=temp/10;
			++count;
		}
		int n=num;
//		while(n!=0) 
		for(int i=1;i<=count;i++){
			prod=prod+(int)Math.pow(n%10, count);
			n=n/10;
		}
		if(prod==num)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}
}
