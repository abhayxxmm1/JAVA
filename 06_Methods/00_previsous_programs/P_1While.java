class P_1While
{
	public static void main(String[] args) 
	{
			extract(2223454);
			countOfExtractedDigit(2223453);
			evenOdd(234235);
			duckNum(2022);

	}
	public static void extract(int num)
	{
		int count = 0;
		while(num>0)
		{
			num/= 10;
			count++;
		}
		System.out.println(count);
	}
	public static void evenOdd(int num)
	{
		int evenCount=0, oddCount=0;
		while(num>0)
		{
			int last = num%10;
			if (last%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num/=10;
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
	public static void duckNum(int num)
	{
		while(num>0)
		{
			if (num%10==0)
			{
				break;
			}
			num/=10;
		}
		if(num>0)
		{
			System.out.println("Duck no");
			System.out.println(num);
		}
		else
		{
			System.out.println("Not Duck");
		}
	}
	public static void countOfExtractedDigit(int num)
	{
		int count = 0;

		while (num > 0)
		{
			num/=10;
			count++;
		}
		System.out.println(count);
	}
}

