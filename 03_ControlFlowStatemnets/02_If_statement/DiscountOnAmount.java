import java.util.Scanner ;
class DiscountOnAmount
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your bill amount: ");

		double amt = sc.nextDouble();

		if(amt > 500)
		{
			amt = amt - (amt*0.1);
			System.out.println("Discount applied: "+amt);
		}
	}
}
