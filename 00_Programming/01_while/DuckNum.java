import java.util.Scanner;
class DuckNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");

		int num = sc.nextInt();

		while (num > 0)
		{
			if (num%10==0)
			{
				break;
			}
			
			num/=10;
		}
		if(num > 0)
			{
				System.out.println("It's a Duck num");
				System.out.println(num);
			}
			else
			{
				System.out.println("It's not a DuckNum");
			}
	}
}
