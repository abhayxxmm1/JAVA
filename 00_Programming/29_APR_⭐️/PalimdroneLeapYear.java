import java.util.Scanner;
class PalimdroneLeapYear
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the year: ");
			int year = sc.nextInt();
			if((year%4==0 && year%100!=0 )|| year%400==0)
			{
				int revyear = 0;
				for(int temp = year; temp != 0; temp/=10)
				{
					revyear = revyear*10 + (temp%10);
				}
				if(year==revyear)
				{
					System.out.println("Its is a palindrome leap year ");
				}
				else
				{
					System.out.println("Not a palindrome leap year");
				}
			}
			else
			{
				System.out.println("Not a leap year ");
			}
	}
}