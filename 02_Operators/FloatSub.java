class FloatSub
{
	public static void main (String[ ] args)
	{
		float a = 1.1f;
		float b = 2.2f;


		
		float add = a + b; 
		float sub = a - b; 
		float mul = a * b; 
		float div = a / b;  
		float mod = a % b;  

		
		System.out.println(add); // 3.3000002
		System.out.println(sub); // -1.1
		System.out.println(mul); // 2.42 
		System.out.println(div); // 0.5
		System.out.println(mod); // 1.1
	}
}