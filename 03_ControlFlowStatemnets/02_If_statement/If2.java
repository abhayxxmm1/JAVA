import java.util.Scanner;
class If2
{
	public static void main (String [] args)
	{
		Scanner areU = new Scanner(System.in);

		System.out.println("Are you a paid student?");

		boolean ip = areU.nextBoolean();
				
		if (ip )  
		{
			System.out.println("pay fees");
		}
		System.out.println("Attend the class");
	}
}