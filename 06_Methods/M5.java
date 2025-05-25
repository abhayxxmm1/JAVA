class M5 // for understanding the flow
{
	public static void main(String[] args) 
	{
		System.out.println("Strats for main");	
		power(5, 4);
		prime(4);
		System.out.println("Ends for main");	
	}

	public static void power(int base, int raise)
	{
		System.out.println("Strats for power");	
		
		int pow = 1;
		for (int i=0; i<raise; i++) 
		{
			pow+=base;
		}
		System.out.println(pow);

		System.out.println("Ends for power");	

	}

	public static void prime(int num)
	{
		System.out.println("Strats for prime");	

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
		System.out.println("Ends for prime");	
	}
}