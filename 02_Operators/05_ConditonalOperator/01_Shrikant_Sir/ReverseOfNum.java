class ReverseOfNum
{
	public static void main(String[] args) {
		int num = 1221, dup = num, rev = 0;

		int rem = num%10;        // 1234 % 10 -> 4
		rev = rev * 10 + rem;    // 0 * 10 + 4 -> 4
		num/=10 ;					// 1234 / 10 -> 123

	 	rem = num%10;            // 123 % 10 -> 3
		rev = rev * 10 + rem;    // 4 * 10 + 3 -> 43
		num/=10 ;					// 123 / 10 -> 12
		
	 	rem = num%10;            // 12 % 10 -> 2
		rev = rev * 10 + rem;    //	43 * 10 + 2 -> 432
		num/=10 ;					// 12 / 10 -> 1
		
	 	rem = num%10;            // 1 % 10 -> 1
		rev = rev * 10 + rem;    //	432 * 10 + 1 -> 4321
		num/=10 ;					// 1 / 10 -> 0

		String op = (rev==dup) ? (" is a palamdrom (same)") : (" is not a paldrom");
		
		 
		System.out.println("num : "+dup+ " reverse : "+rev+ op) ;
	}
}