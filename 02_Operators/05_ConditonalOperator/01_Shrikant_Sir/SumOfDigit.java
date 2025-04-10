class SumOfDigit
{
	public static void main(String[] args) 
	{
		int num = 1234, dup = num, sum = 0;

		int rem = num%10;    // 1234 % 10 -> 4
		sum += rem;			 // 0 + 4 -> 4
		num /= 10;			 // 1234 / 10 -> 123

		rem = num%10;		 // 123 % 10 -> 3
		sum += rem;			 // 4 + 3 -> 7
		num /= 10;			 // 123 / 10 -> 12

		rem = num%10;		 // 12 % 10 -> 2
		sum += rem;			 // 7 + 2 -> 9
		num /= 10;			 // 12 / 10 -> 1

		rem = num%10;		 // 1 % 10 -> 1
		sum += rem;			 //	9 + 1 -> 10
		num /= 10;			 // 1 / 10 -> 0

		System.out.println("num : "+dup+" sum : "+sum);

	}
}