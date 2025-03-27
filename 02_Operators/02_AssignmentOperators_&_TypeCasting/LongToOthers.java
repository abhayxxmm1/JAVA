class LongToOthers
{
	public static void main (String[] args)
	{
		long a = 100;

		// int t = a; // error: incompatible types: possible lossy conversion from long to int

		long u = a;
		float v = a;
		double w = a;



		// System.out.println(t); // 
		System.out.println(u); // 
		System.out.println(v); // 
		System.out.println(w); // 



	}
}