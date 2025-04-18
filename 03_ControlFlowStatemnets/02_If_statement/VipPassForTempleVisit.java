import java.util.Scanner;
class VipPassForTempleVisit
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);

		int pay = 500;

		System.out.println("Do you want VIP PASS ?");
		boolean pass = sc.nextBoolean();

		if (pass)
		{
			System.out.println("Then "+pay+" & go through the VIP line ");
		}
		System.out.println("Follow the line from behind ");
	}
}