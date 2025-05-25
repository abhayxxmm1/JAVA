class palindromicPrime
{

	// public static void main( ) 
	// {
		/**
		 *  Main method not found in class palindromicPrime, please define the main method as:
		 * public static void main(String[] args)
		 * 
		 * if we pass empty formal argument
		 */
	// }
	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		for (int i=num; i!=0; i/=10) 
		{
			rev = rev*10 + (i%10);			
		}
		return num==rev;
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		while (den<num)
		{
			if (num%den==0) 
			{
				return false;		// break;	
			}
			den++;
		}
		return true;				// return num==den;;
	}

	public static void main(String[] args) {
		if (isPalindrome(131) && isPrime(131)) 
		{
			System.out.println("Palindromic prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
	}
}