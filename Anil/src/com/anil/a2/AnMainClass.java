package com.anil.a2;

public class AnMainClass 
{
	public static void main(String[] args) 
	{
		AnCat c1 = new AnCat();
		AnDog d1 = new AnDog();
		AnSnake s1 = new AnSnake();
		
		AnAnimalSimulator a1 = new AnAnimalSimulator();
		
		a1.MakeNoise(c1);
		a1.MakeNoise(d1);
		a1.MakeNoise(s1);
		
	}

}
