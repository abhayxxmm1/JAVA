class ByteToOthers
{
	public static void main (String[] args)
	{
		byte a = 100;

		short s = a;
		int t = a;
		long u = a;
		float v = a;
		double w = a;
		// char x = a;

		System.out.println(s); // 100
		System.out.println(t); // 100
		System.out.println(u); // 100
		System.out.println(v); // 100.0
		System.out.println(w); // 100.0
		// System.out.println(x); //error: incompatible types: possible lossy conversion from byte to char


	}
}