class CharSub
{
	public static void main (String[ ] args)
	{
		char a = 'a';
		char b = 'b';

		// char add = a + b; 
		// char sub = a - b; // error: incompatible types: possible lossy conversion from int to char
		// char mul = a * b; 
		// char div = a / b;  
		// char mod = a % b;
		
		int add = a + b; 
		int sub = a - b; 
		int mul = a * b; 
		int div = a / b;  
		int mod = a % b;

		System.out.println(add); // 195
		System.out.println(sub); // -1
		System.out.println(mul); // 9506
		System.out.println(div); // 0
		System.out.println(mod); // 97
	}
}