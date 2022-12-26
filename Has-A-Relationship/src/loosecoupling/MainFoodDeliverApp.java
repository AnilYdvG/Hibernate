package loosecoupling;

import java.util.Scanner;

interface FoodDeliveryApp
{
	void orderFood();
}
class Swiggy implements FoodDeliveryApp

{
	@Override
	public void orderFood()
	{
		System.out.println("Ordering Food from Swiggy");
	}
}

class Zomato implements FoodDeliveryApp
{
	@Override
	public void orderFood()
	{
		System.out.println("Ordering Food from Swiggy");
	}
}
class UberEats implements FoodDeliveryApp
{
	@Override
	public void orderFood()
	{
		System.out.println("Ordering Food from Swiggy");
	}
}

class Person
{
	static FoodDeliveryApp app;
	// loose Coupling because app is a reference variable of type  foodDeliverApp
	// so we can store instance of Swiggy , Zomato or UberEats

	void setApp(int choice)
	{
		if(choice == 1)
			app = new Swiggy();
		else if(choice == 2)
			app = new Zomato();
		else if(choice == 3)
			app = new UberEats();
	}
}
class MainFoodDeliverApp //Mobile
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		Scanner scan = new Scanner(System.in);
		System.out.println("Press \n 1-->Swiggy \n 2-->Zomato \n 3--> UberEat");
		int choice = scan.nextInt();
		scan.close();
		p.setApp(choice);
		if(p.app!=null)
			p.app.orderFood();
		else System.err.println("INVALID CHOICE");

	}


}
