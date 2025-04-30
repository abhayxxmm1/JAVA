import java.util.Scanner;
class NumFiboOrNot
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		int n1 = 0, n2 = 1, n3;

		int count = 0;
		while(true)
		{
			n3 = n1 + n2;

			if (n1==num) 
			{
				System.out.println("It is fibonacci number");	
				break;
			}
			else if(n1>num)
			{
				System.out.println("Not a fibonacci number");
				break;
			}
			else
			{
				n1=n2;
				n2=n3;
			}
		}
			System.out.println(n1);
	}
}