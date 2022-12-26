package mypractice;

public class Bloks 
{
	static int age;
	String name;
	static int a;
	int b;
	
	static
	{
		 a=10;
		 System.out.println(a);
	}
	{
		b=20;
		System.out.println(b);
	}
	static
	{
		age=24;
	}
	static
	{
		age=30;
	}
	{
		name="Dimple";
	}
	{
		name= "no name";
	}
	public static void main(String[] args) {
		
		System.out.println("Main mtd started");
		
		Bloks b = new Bloks();
		System.out.println("Hi all");
		System.out.println(age);
		System.out.println(b.name);
		System.out.println(b.b);
		System.out.println("Main mtd ended");
	}
	

}
