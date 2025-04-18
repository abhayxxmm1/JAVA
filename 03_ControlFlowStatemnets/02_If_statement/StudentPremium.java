import java.util.Scanner;
class StudentPremium
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);

		double pay = 119;

		System.out.println("Are you a Student 🧑‍🎓?");
		boolean std = sc.nextBoolean();

		if (std) {
			pay = pay - (pay*0.5);
			System.out.println();
			System.out.println("Smart boiii...😎");
		}

		System.out.println();
		System.out.println("For lsitening Songs pay: "+pay+" Rs");
	}
}