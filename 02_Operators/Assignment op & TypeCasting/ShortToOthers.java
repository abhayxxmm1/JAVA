class ShortToOthers
{
	public static void main (String[] args)
	{
		short a = 100;

		// char s = a; //error: incompatible types: possible lossy conversion from short to char
		int t = a;
		long u = a;
		float v = a;
		double w = a;


		// System.out.println(s);
		System.out.println(t); // 100
		System.out.println(u); // 100
		System.out.println(v); // 100.00
		System.out.println(w); // 100.00



	}
}