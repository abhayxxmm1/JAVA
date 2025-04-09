class WithOutModulus // EVEN OR ODD
{
	public static void main(String[] args) 
	{
		int num = 230;
		// logic 1
		String op = ((num/2)*2 == (num/2.0)*2) ?
					 "even"	: 
					 "odd";

		System.out.println(op);

		// logic 2
		String op1 = ((num/2)*2 == num) ?
					(num+ " is even") :
					(num+ " is odd");
	}
}