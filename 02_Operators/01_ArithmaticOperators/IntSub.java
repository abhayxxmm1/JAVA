class IntSub
{
	public static void main (String[ ] args)
	{
		int a = 1000;
		int b = 2000;

		int add = a + b; 
		int sub = a - b; 
		int mul = a * b; 
		int div = a / b;  
		int mod = a % b;  
		
		System.out.println(add); // 3000
		System.out.println(sub); // -1000
		System.out.println(mul); // 2000000
		System.out.println(div); // 0
		System.out.println(mod); // 1000
	}
}