package excption.hadling;

public class Top4ExcCCE 
{
	public static void main(String[] args) 
	{		
		String s = new String("Tom");			
		Object o = (Object)s;			//Upcasting
		System.out.println(o);
		
		
		System.out.println("=============");
		Object o2 = new String("Mogli");			//upcasting
		String s2 = (String)o2;						//downcasting
		System.out.println(s2);
		
		System.out.println("------------");
		
		Object o1 = new Object();
		String s1 = (String)o1;
		System.out.println(s1);
	}

}
