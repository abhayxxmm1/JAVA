import java.util.Scanner;
class EvenOddCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");

		int num = sc.nextInt();
		int evencount = 0, oddcount = 0;

		while (num > 0)
		{
			int last = num %10 ;
			if (last%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num/=10;
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}
}
// 345346543685695 error why