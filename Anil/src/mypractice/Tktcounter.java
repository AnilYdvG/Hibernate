package mypractice;

public class Tktcounter 
{
	int tkts;
	int counternumber;
	
	void viewtks()
	{
		System.out.println("Total tkts available are: "+tkts);
	}
	void counternumber(int counternumber)
	{
		this.counternumber = counternumber;
		System.out.println("Welcome to counter number: "+counternumber);
	}
	void buying_tkts(int n)
	{
		System.out.println("Buying tkt request: "+n);
		if(tkts>=n)
		{
			System.out.println("Buying successful");
			tkts-=n;
		}
		else
		{
			System.out.println("Sorry!! sufficient tkts are not available");
		}
	}
	void cancel_tks(int n)
	{
		System.out.println("Cancelling tkts: "+n);
		tkts+=n;
	}
	

}
