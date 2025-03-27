class LongSub
{
	public static void main (String[ ] args)
	{
		long a = 10000l;
		long b = 20000l;

		long add = a + b; 
		long sub = a - b; 
		long mul = a * b; 
		long div = a / b;  
		long mod = a % b;  

		System.out.println(add); // 30000
		System.out.println(sub); // -10000
		System.out.println(mul); // 200000000
		System.out.println(div); // 0
		System.out.println(mod); // 10000
	}
}