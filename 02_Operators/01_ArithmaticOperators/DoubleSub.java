class DoubleSub
{
	public static void main (String[ ] args)
	{
		double a = 1.1;
		double b = 2.2;

		
		double add = a + b; 
		double sub = a - b; 
		double mul = a * b; 
		double div = a / b;  
		double mod = a % b;  

		
		System.out.println(add); // 3.3000000000000003
		System.out.println(sub); // -1.1
		System.out.println(mul); // 2.4200000000000004
		System.out.println(div); // 0.5
		System.out.println(mod); // 1.1
	}
}