package mypractice;

public class P_cons 
{
	int age=23;
	P_cons(String name,int age,int rollno)
	{
		System.out.println("Name: "+name+"\t age: "+age+"\t & Rollno: "+rollno);
	}
	public static void main(String[] args) {
		P_cons p = new P_cons("Sukh",22,1234);
		System.out.println(p.age);
	}
}
