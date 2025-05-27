class HappyNumber
{
	public static boolean isHappy(int num)
	{
		while(num!=1 && num!=4)
		{
			num=sumOfSqOfDigit(num);
		}
		return num==1;
	}
	public static int sumOfSqOfDigit(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			int last = num%10;
			sum+=(last*last);
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		System.out.println(isHappy(19));
	}
}