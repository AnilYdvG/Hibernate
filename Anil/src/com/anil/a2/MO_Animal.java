package com.anil.a2;

public class MO_Animal {

}
class Monkey extends MO_Animal
{	
	
}
class Test
{
	public void m1(MO_Animal a)
	{
		System.out.println("Animal version");
	}
	public void m1(Monkey m)
	{
		System.out.println("Monkey version");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		MO_Animal a = new MO_Animal();
		t.m1(a);
		
		Monkey m = new Monkey();
		t.m1(m);
		
		MO_Animal a1 = new Monkey();
		t.m1(a1);
	}
}
