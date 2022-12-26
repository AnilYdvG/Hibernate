package logical;

public class LeapYearCheck 
{
	public static void check(int yr)
	{
		if(yr%100==0 || yr%100!=0 && yr%4==0)
			System.out.println(yr+" ---> leap year");
		
		else System.out.println(yr+" --> Not leap year");
	}

	public static void main(String[] args) 
	{
		check(2100);
		check(2342);
		check(2024);
	}
}
