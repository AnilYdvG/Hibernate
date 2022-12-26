package logical;

public class Palindrome 
{
	public static String isPalindrome(int n)
	{
		int temp=n;
		int res=0;
		while(temp>0)
		{
			int rem = temp%10;
			res=res*10+rem;
			temp=temp/10;
		}
		if(n == res)
			return n+" is palindrome as reverse of "+n+" --> "+res;
		return n+" is not palindrome as reverse of "+n+" --> "+res;
		
	}
	public static void main(String[] args) 
	{
		System.out.println(isPalindrome(12321));
	}
}

class AddSingDigitInLast
{
	public static void addingInLast(int n1,int n2)
	{
		
		int rem = n1*10+n2;
		System.out.println("After adding "+n2+" in last of "+n1+" ,The new number --> "+rem);
	}
	public static void main(String[] args) 
	{
		addingInLast(123,9);
		
	}
}
