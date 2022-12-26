package com.anil.a2;

public class GMainClass 
{
	public static void main(String[] args) 
	{
		GPerson p1 = new GPerson("Tom",20,'M');
		GStudent s1 = new GStudent("Jerry",21,'M',123,85.7,"JSP University");
		GEmployee e1 = new GEmployee("Mogli",23,'M',786,500000,"SE");
		
		GGov goi = new GGov();
		
		goi.AadharEnroll(p1);
		goi.AadharEnroll(e1);
		goi.AadharEnroll(s1);
		
		goi.TaxPayment(e1);
		goi.Schlorship(s1);
	}

}
