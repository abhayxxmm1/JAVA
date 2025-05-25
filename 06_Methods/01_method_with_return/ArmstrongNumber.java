class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		System.out.println(isArmstrong(153));
	}

	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		int sum =0;
		for (int i=num; i!=0; i/=10) 
		{						
							    // int last = i%10;
			sum+=power(i%10,ct);	// sum+=power(last,ct) 
		}

		return num==sum;
	}
	public static int count(int num)
	{
		int ct=0;
		while (num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int digit, int ct)
	{
		int pow=1;
		while (ct>0)
		{
			pow*=digit;
			ct--;
		}
		return pow;
	}
}
	/**
	public static int count(int num)
	{	
		int count=0;
		for (int i=num; i!=0; i/=10) 
		{
			count++;	
		}

		return count;
	}
	public static int power(int num)
	{
		int pow=1;
		int sum=0;
		int ct = count(num);
		for (int times=0; times ct; times++)
		{
			pow*=num%10;
			sum+=pow;
		}

		return sum;
	}
	public static boolean isArmstrong(int num)
	{
		// if(num==power(num))
		// {
		// 	System.out.println("Is Armstrong Number");
		// }
		// else
		// {
		// 	System.out.println("Not Armstrong");
		// }
		int pow = power(num);
		return num==pow;

	}
	*/
