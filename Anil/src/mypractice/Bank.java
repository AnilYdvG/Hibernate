package mypractice;

public class Bank 
{
	String AH_name;
	int acc_num;
	double acc_bal;
	String Bank;
	
	void Bankname()
	{
		System.out.println("Welcome to"+Bank+" Bank");
	}
	void view_bal()
	{
		System.out.println("Account Holder name:"+AH_name+"\t Acc num :"+acc_num+"\t bal is Rs: "+acc_bal);
	}

	void withdraw(double n)
	{
		System.out.println("Requesting Withdraw of Rs: "+n);
		if(acc_bal-n>=2000)
		{
			acc_bal-=n;
			System.out.println("Withdrawl successful");
		}
		else
		{
			System.out.println("Not sufficient fund available,Kindly withraw lesser amount");
		}
	}
	void deposit(double n)
	{
		acc_bal+=n;
		System.out.println("Deposit request amaount of Rs: "+n+" successful");
	}
}
