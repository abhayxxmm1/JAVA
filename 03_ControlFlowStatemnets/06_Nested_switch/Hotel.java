import java.util.Scanner;
class Hotel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)	;
		System.out.println("--------------Welcome to Hotel Sanji-------------");
		System.out.println("select the type of food you want to eat");
		System.out.println("1: Veg");
		System.out.println("2: Non-Veg");
		int ip = sc.nextInt();
		switch(ip)
		{
			case 1:
				{
					System.out.println("enter the dish you want to eat");
					System.out.println("1:idli sambar -----> 25.00");
					System.out.println("2:wada sambar -----> 35.00");
					System.out.println("3:dhosa       -----> 25.00");
					System.out.println("4:panner      -----> 80.00");
					int dish = sc.nextInt();
					switch(dish)
					{
					case 1:
					case 3:
						{	
							System.out.println("enter the number to dishesh: ");
							int no = sc.nextInt();
							if (no>0) {
								double total = 25*no;
								System.out.println("your total amount is : "+total);
								break;
							}
							
						}break;
					case 2:
						{	
							System.out.println("enter the number to dishesh: ");
							int no = sc.nextInt();
							if (no>0) {
								double total = 35*no;
								System.out.println("your total amount is : "+total);
								break;
							}
							
						}break;
					case 4:
						{	
							System.out.println("enter the number to dishesh: ");
							int no = sc.nextInt();
							if (no>0) {
								double total = 80*no;
								System.out.println("your total amount is : "+total);
								break;
							}
							
						}break;
					default:
						{
							System.out.println("learn maths first then come again");
						}
					}
				}
			case 2:
				{
					System.out.println("enter the dish you want to eat");
					System.out.println("1:biryani	   -----> 140.00");
					System.out.println("2:Chiken thali -----> 120.00");
					System.out.println("3:paplet       -----> 140.00");
					System.out.println("4:mutton       -----> 180.00");
					int dish = sc.nextInt();
					switch(dish)
					{
					case 1:
					case 3:
						{	
							System.out.println("enter the number to dishesh: ");
							int no = sc.nextInt();
							if (no>0) {
								double total = 140*no;
								System.out.println("your total amount is : "+total);
								break;	
							}
						}break;
					case 2:
						{	
							System.out.println("enter the number to dishesh: ");
							int no = sc.nextInt();
							if (no>0) {
								double total = 120*no;
								System.out.println("your total amount is : "+total);
								break;
							}
							
						}break;
					case 4:
						{	
							System.out.println("enter the number to dishesh: ");
							int no = sc.nextInt();
							if (no>0) {
								double total = 180*no;
								System.out.println("your total amount is : "+total);
								break;
							}
							
						}break;
					default:
						{
							System.out.println("learn maths first");
						}
					}
				}break;
	default:
		{
			System.out.println("from which planet do you belong from? ");
		}

		}
	}
}