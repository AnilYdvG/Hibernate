package logical;

class Pattern1 
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
	}

}

class Pattern2
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

class Pattern3
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}


class Pattern4
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
	}
}


class Pattern5
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(i-j+" ");
			}
			System.out.println();
		}
	}
}

class Pattern6
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(2*i+j+" ");
			}
			System.out.println();
		}
	}
}


class Pattern7
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+2*j+" ");
			}
			System.out.println();
		}
	}
}


class Pattern8
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(2*(i+j)+" ");
			}
			System.out.println();
		}
	}
}

class Pattern9
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(2*i-j+" ");
			}
			System.out.println();
		}
	}
}


class Pattern10
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i-2*j+" ");
			}
			System.out.println();
		}
	}
}