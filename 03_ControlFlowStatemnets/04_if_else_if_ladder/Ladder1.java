import java.util.Scanner;
class Ladder1
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained: ");
		double marks = sc.nextDouble();

		if (marks>=0 && marks<35)
		{
			System.out.println("Fail");
		}
		else if( marks == 35)
		{
			System.out.println("Just pass");
		}
		else if( marks > 35 && marks < 60)
		{
			System.out.println("Second class");
		}
		else if( marks > 60 && marks < 75)
		{
			System.out.println("First class");			
		}
		else if( marks > 75 && marks < 90)
		{
			System.out.println("First class with distinction");			
		}
		else if( marks > 90 && marks <=100)
		{
			System.out.println("Distinction!");
		}
		else
		{
			System.out.println("Not considerable");
		}
	}
}