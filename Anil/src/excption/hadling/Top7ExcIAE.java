package excption.hadling;

public class Top7ExcIAE 
{
	public static void main(String[] args) 
	{
		Thread t =new Thread();		//thread priority is between 1 to 10 only
		t.setPriority(10);			//Highest priority
		t.setPriority(1);			//least Priority
		t.setPriority(100);			//out of range
		
		
	}

}
