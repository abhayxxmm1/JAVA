import java.util.Scanner;
class Fibo
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");

		int no = sc.nextInt();
		int n1 = 0, n2 = 1, n3;

		int count = 0;
		while(count<no)
		{
			n3 = n1 + n2;
			System.out.println(n1);

			n1=n2;
			n2=n3;
			count++;
		}
	}
}