import java.util.Scanner;
class MergeName
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter your first name: ");
		String firstName = sc.next();

		System.out.println("Enter your last name: ");
		String lastName = sc.next();

		String fullName = firstName +" "+ lastName;

		System.out.println(fullName);
	}
}