class ByteSub
{
	public static void main (String[] args)
	{
		byte a = 10;
		byte b = 20;

		// byte add = a + b; 
		// byte sub = a - b; // error: incompatible types: possible lossy conversion from int to byte
		// byte mul = a * b; 
		// byte div = a / b;  
		// byte mod = a % b;
		
		int add = a + b; 
		int sub = a - b; 
		int mul = a * b; 
		int div = a / b;  
		int mod = a % b;

		System.out.println(add); // 30
		System.out.println(sub); // -10
		System.out.println(mul); // 200
		System.out.println(div); // 0
		System.out.println(mod); // 10
	}
}