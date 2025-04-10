class ProductOfDigit
{
	public static void main(String[] args) 
	{
		int num = 1234, dup = num, pro = 1;

		int rem = num%10;     // 1234 % 10 -> 4
		pro *= rem;			  // 1 * 4 -> 4
		num /= 10;            // 1234 / 10 -> 123

		rem = num%10;		  // 123 % 10 -> 3
		pro *= rem;			  // 4 * 3 -> 12
		num /= 10;            // 123 / 10 -> 12

		rem = num%10;		  // 12 % 10 -> 2
		pro *= rem;			  // 12 * 2 -> 24
		num /= 10;            // 12 / 10 -> 1

		rem = num%10;		  // 1 % 10 -> 1
		pro *= rem;			  // 24 * 1 -> 24
		num /= 10;            // 1 / 10 -> 0

		System.out.println("num : "+dup+" product : "+pro);

	}
}