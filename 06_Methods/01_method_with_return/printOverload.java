class printOverload
{
	public static int sumOfDigit(int num)
	{
		int sum = 0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int ans = sumOfDigit(12344)	;

		System.out.println(ans);

		System.out.println(sumOfDigit(2343)); //
	}
}