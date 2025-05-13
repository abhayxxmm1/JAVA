class Amstrong
{
	public static void main (String [] args)
	{
		int num = 153;
		int sum = 0;
		int count = 0;

		for (int i=num; i != 0; i/=10) 
		{
			count ++;	
		}
		for (int i=num; i != 0; i/=10) 
		{
			int last = i%10;

			int power = 1;

			for (int times = 0; times<count; times++)
			{
				power*=last; // power = power * last;

			}	
			sum+=power; // sum = sum + power;

			if (num == sum)
			{
				System.out.println("It is amstrong number ");
			}
			else
			{
				System.out.println("Not amstrong ");
			}
		}
	}
}

/*
	1>	extract
	2>	find power 1^5 + 2^5 + 3^5 + 4^5 + 5^5
	3>	sum
	4>	remove
*/