class M4
{
	public static void main(String[]args)
	{
		power(5, 4);
		prime(4);

	}

	public static void power(int base, int raise)
	{
		int pow = 1;
		for (int i=0; i<raise; i++) 
		{
			pow+=base;
		}
		System.out.println(pow);
	}

	public static void prime(int num)
	{
		int den=2;
		while(den<num/2)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		if (num/2==den) 
		{
			System.out.println("it is Prime");
		}
		else
		{
			System.out.println("Not a Prime");
		}
	}
}