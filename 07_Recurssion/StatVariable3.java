class StatVariable3 // Real time example but add more of yours here
{
	static double balance;
	public static void main(String[] args) 
	{
		System.out.println(balance);	

		credit(10000);
		debit(100);

		System.out.println(balance);
	}

	public static void debit (double amt)
	{
		if (amt >0 && balance-amt > 2000)
		{
			balance = balance-amt;
			System.out.println("Amount debited!");
		}
		else
		{
			System.out.println("Invalid or insufficient balance");
		}
	}
	public static void credit(double amt)
	{
		if(amt>0)
		{
			balance = balance+amt;
			System.out.println("Amouunt Credited !");
		}
		else
		{
			System.out.println("Amount Incorrect!");
		}
	}
}