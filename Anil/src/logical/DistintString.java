package logical;

public class DistintString 
{
	public static void main(String[] args) 
	{

		String s="Hello Welcome";
		char [] a = s.toCharArray();
		
		System.out.println(a.length);
		for(int i = 0;i<=a.length-1;i++)
		{
			for(int j = 1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
					continue;				
			}
			
		}
			
	}

}

