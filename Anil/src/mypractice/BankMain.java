package mypractice;

public class BankMain 
{
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.acc_bal=45000.00;
		b.Bank="HDFC";
		b.acc_num = 954312545;
		b.AH_name="Sukh";
		b.Bankname();
		b.view_bal();
		b.deposit(25000.36);
		b.view_bal();
		b.withdraw(36000.46);
		b.view_bal();
	}
}
