import java.util.Scanner;
class Tables 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)	;
		System.out.println("Enter the number for table ");

		int num = sc.nextInt();


		for (int n = 1; n<=10; n++ ) {
			System.out.println(num+ " * " +n+ " = " +(num*n));
		}
	}
}