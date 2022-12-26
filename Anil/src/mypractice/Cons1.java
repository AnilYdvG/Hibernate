package mypractice;

public class Cons1 
{
	int a=50;
	int age=20;
	String name="Ramesh";
	int rollno = 12334;;
	Cons1()
	{
		System.out.println("Name: "+name+"\t age: "+age+"\t & Rollno: "+rollno);
	}
	public static void main(String[] args) 
	{
		
		Cons1 c = new Cons1();
		System.out.println(c.a);
		System.out.println(c.name);
	}

}
