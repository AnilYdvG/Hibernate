package lc;

interface Cab
{
	void travel();
}
class Ola implements Cab
{
	@Override
	public void travel()
	{
		System.out.println("Travelling using Ola App");
	}	
}

class Uber implements Cab
{
	@Override
	public void travel()
	{
		System.out.println("Travelling using Uber App");
	}	
}


