import java.util.Scanner;
class StrongNum
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		int sum = 0;
		int temp = num; // temporary number

		while (num != 0)
		{
			int last = num%10;
			int fact = 1;

			while (last > 10) // find factorial
			{
				fact = fact * last;
				last--;
			}
			sum = sum + fact;
			num/=10;

			if (sum == temp) 
			{
				System.out.println("It is strong ");	
			}
			else
			{
				System.out.println("It is not strong ");
			}
		}
	}
}
		
/*
	1>	extract
	2>	find factorial
	3>	sum
	4>	remove
*/