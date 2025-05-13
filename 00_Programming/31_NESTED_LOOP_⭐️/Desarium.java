class Desarium
{
	public static void main (String [] args)
	{
		int num = 135;
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
				count--;

			}	
			sum+=power; // sum = sum + power;

			if (num == sum)
			{
				System.out.println("It is Desarium number ");
			}
			else
			{
				System.out.println("Not Desarium ");
			}
		}
	}
}

/*
	1>	extract
	2>	find power 1^1 + 2^2 + 3^3 + 4^4 + 5^5
	3>	sum
	4>	remove
*/