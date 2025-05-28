class Imp
{
	public static void main(String[] args) 
	{
		// System.out.println( checkFibo(5, 0, 1));
		// factors(100, 1);
		// System.out.println(prime(3, 2));
		// rangeOfPrime(10,1000);
		// System.out.println(sumOfDigit(10234,0));
		// System.out.println(palindrome(101, 0, 101)); // ❓
		System.out.println(isAmstrong(151, 0, 151));
		rangeOfAmstrong(10, 100);
		System.out.println(isStrong(145, 0, 145));
		rangeOfStrong(1, 1000);
	}
	public static boolean checkFibo(int num, int n1, int n2)
	{
		return n1>num ? false : (num==n1 ? true : checkFibo(num, n2, n1+n2));
	}
	public static void factors(int num, int den)
	{
		if(den<=num)
		{
			if(num%den==0)
			{
				System.out.println(den);
			}
			factors(num, den+1);
		}
	}
	public static boolean prime(int num, int den)
	{
		if (den<num)
		{
			if(num%den==0)
			{
				return false;
			}
			else
			{
				return prime(num, den+1);
			}
		}
		else if (den==num)
		{
			return true;
		}

		return false;
	}
	public static void rangeOfPrime(int start, int end)
	{
		if(start<=end)
		{
			if(prime(start, 2))
			{
				System.out.println(start);
			}
			rangeOfPrime(start+1, end);
		}
	}
	public static int sumOfDigit(int num, int sum)
	{
		if(num!=0)
		{
			sum = sum + num%10;
			return sumOfDigit(num/10, sum);
		}
		return sum;
	}
	public static boolean palindrome(int num, int rev, int temp) // while checking temp is used
	{
		if(temp!=0)
		{
			rev = rev*10 + temp;
			return palindrome(num, rev, temp/10);
		}
		return num==rev;
	}


	//////////							///////////
	public static int power(int base, int raise)
	{
		if(raise==0)
		{
			return 1;
		}
		return power(base, raise-1);
	}
	public static int count(int num, int ct)
	{
		if(num!=0)
		{
			return count(num/10, ct+1);
		}
		return ct;
	}
	public static boolean isAmstrong(int num, int sum, int temp) // while checking temp is used
	{
		int ct = count(num,0);
		if(temp!=0)
		{
			sum = sum + power(temp%10, ct);
			return isAmstrong(num, sum, temp/10);
		}
		return num==sum;
	}
	public static void rangeOfAmstrong(int start, int end)
	{
		if(start<=end)
		{
			if(isAmstrong(start, 0, start))
			{
				System.out.println(start);
			}
			rangeOfPrime(start+1, end);
		}
	}


	////////////		///////////
	public static int factorial(int num)
	{
		return num==0 ? 1 : num*factorial(num-1);
	}
	public static boolean isStrong(int num, int sum, int temp)
	{
		if (temp!=0)
		{
			sum = sum + factorial(temp%10);
			return isStrong(num, sum, temp/10);
		}
		return num == sum;
	}
	public static void rangeOfStrong(int start, int end)
	{
		if(start<=end)
		{
			if(isStrong(start, 0, start))
			{
				System.out.println(start);
			}
			rangeOfStrong(start+1, end);
		}
	}
}