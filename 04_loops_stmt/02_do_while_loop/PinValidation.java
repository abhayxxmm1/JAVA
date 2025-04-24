import java.util.Scanner;
class PinValidation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int attempt = 0;
		int storedPin = 2344;

		do
		{
			System.out.println("enter the pin: ");
			int pin = sc.nextInt();
			if (pin==storedPin)
			{
				System.out.println("success");
				break;
			}
			else
			{
				System.out.println("Inccorect pin ");
				attempt++;
			}
		}
		while(attempt < 4);
		if(attempt==4)
		{
			System.out.println("The max attempt are reached !");
		}
	}
}