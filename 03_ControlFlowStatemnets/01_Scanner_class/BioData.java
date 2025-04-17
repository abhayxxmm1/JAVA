import java.util.Scanner;
class BioData
{
	public static void main(String[] args) 
	{
		Scanner bio = new Scanner(System.in);

		System.out.println("Write your firt Name ");
		String firstName = bio.nextLine();

		System.out.println("Write your last Name ");
		String lastName = bio.nextLine();

		String fullName =  firstName +" "+ lastName;

		System.out.println("Write your age");
		int age = bio.nextInt();
		bio.nextLine();

		System.out.println("Write your branch Name ");
		String branch = bio.nextLine();

		System.out.println("Write your institute Name ");
		String instituteName = bio.nextLine();

		System.out.println("your name is "+fullName);
		System.out.println("your age is "+age);
		System.out.println("your branch is "+branch);
		System.out.println("instituteName is "+instituteName);


	}
}