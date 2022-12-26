package mypractice;

public class TktsMain 
{
	public static void main(String[] args) {
		System.out.println("Entering to tkts website");
		
		Tktcounter t = new Tktcounter();
		t.counternumber(123);
		t.tkts=250;
		t.viewtks();
		t.buying_tkts(150);
		t.viewtks();
		t.cancel_tks(100);
		t.viewtks();
		t.buying_tkts(300);
		t.viewtks();		
		System.out.println("Coming out of tkts website");
	}

}
