class strongNumber
{
	public static int factorial(int digit)
	{
		int fact =1;
		while(digit>0)
		{
			fact*=digit;
			digit--;
		}
		return fact;
	}
	public static boolean isStrong(int num)
	{
		int sum = 0;

		for (int i=num; i!=0; i/=10) 
		{
			sum+=factorial(i%10); // sum=sum+factorial(last)
		}

		return num==sum;
	}

	public static void main(String[] args) 
	{
		System.out.println(isStrong(145));	
	}
}