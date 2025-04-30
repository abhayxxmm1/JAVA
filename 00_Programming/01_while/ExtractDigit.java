import java.util.Scanner;
class ExtractDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbere :");

		int no = sc.nextInt();

		while (no > 0)
		{
			int last = no%10;
			System.out.println(last);
			no/=10;
		}
	}
}