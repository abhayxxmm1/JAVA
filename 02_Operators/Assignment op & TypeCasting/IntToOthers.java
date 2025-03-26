class IntToOthers
{
	public static void main (String[] args)
	{
		int a = 100;

		// char s = a; //error: incompatible types: possible lossy conversion from short to char
		int t = a;
		long u = a;
		float v = a;
		double w = a;


		// System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);



	}
}