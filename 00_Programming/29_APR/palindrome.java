import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");	

		int num = sc.nextInt();
		int temp = num;
		int rev = 0;

		while(num!=0)
		{
			rev = rev*10 + (num%10);
			num/=10;
		}
		if(temp==rev)
		{
			System.out.println("It is a palindrome ");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}