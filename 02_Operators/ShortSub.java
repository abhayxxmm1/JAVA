class ShortSub
{
	public static void main (String[ ] args)
	{
		short a = 200;
		short b = 500;
		
		// char add = a + b; 
		// char sub = a - b; // error: incompatible types: possible lossy conversion from int to short
		// char mul = a * b; 
		// char div = a / b;  
		// char mod = a % b;

		int add = a + b; 
		int sub = a - b; 
		int mul = a * b; 
		int div = a / b;  
		int mod = a % b;

		System.out.println(add); // 700
		System.out.println(sub); // -300
		System.out.println(mul); // 100000
		System.out.println(div); // 0
		System.out.println(mod); // 200
	}
}