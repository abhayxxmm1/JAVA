import java.util.Scanner ;
class Scan1
{
	public static void main(String[] args) 
	{
		Scanner d = new Scanner(System.in)	;

		System.out.println("Enter the first number: ");
		int n1 = d.nextInt();

		System.out.println("Enter the Second number: ");
		int n2 = d.nextInt();

		int res = n1 + n2;
		System.out.println("The sum of "+n1+" and "+n2+" is: "+res);
	}
}