import java.util.Scanner;
class Tables
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)	;

		System.out.println("enter the number");
		int num = sc.nextInt();

		int n = 1;
		do 
		{
			System.out.println(num+ " * " +n+ " = " +(num*n) );
			n++;
		}
		while(n<=10);
	}
}
