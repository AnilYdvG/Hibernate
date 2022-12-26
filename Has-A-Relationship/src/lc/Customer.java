package lc;

class Customer 
{
	Cab cab; 
	//if choice is 1 internally -> Cab cab = new Ola();
	//if choice is 2 internally -> Cab cab = new Uber();
	//if choice is apart from 1 and 2 (default value is applicable) Cab cab = null;
	
	void setCab(int choice)
	{
		if(choice == 1)
		{
			cab = new Ola();
		}
		else if(choice == 2)
		{
			cab = new Uber();
		}
	}

}
