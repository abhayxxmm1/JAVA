import java.util.Scanner;
class FiboCount
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");

		int no = sc.nextInt();
		int n1 = 0, n2 = 1, n3;

		int count = 0;
		while(n1<no)
		{
			n3 = n1 + n2;

			n1=n2;
			n2=n3;
			count++;
		}
			System.out.println(count);
	}
}