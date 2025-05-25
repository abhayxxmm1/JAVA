class rangeOfPrime
{
	public static void rangeOfPrime(int start, int end)
	{
		while(start<=end)
		{
			if(isPrime(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		while(den<num)
		{
			if (num%den==0) 
			{
				return false;	
			}
			den++;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		rangeOfPrime(100, 200);
	}
}