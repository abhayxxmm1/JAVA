import java.util.Scanner;
class Reverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)	;
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int rev = 0;

		while(num!=0) // !=0 bcoz user can give the -ve input also
		{
			rev = rev * 10 + (num%10);
			num/=10;
		}
		System.out.println(rev);
	}
}