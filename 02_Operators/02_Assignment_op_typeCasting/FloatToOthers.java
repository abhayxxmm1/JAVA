class FloatToOthers
{
	public static void main (String[] args)
	{
		float a = 100*65.006f;

		// char s = a; 
		// int t = a; //  error: incompatible types: possible lossy conversion from float to int
		// long u = a; // error: incompatible types: possible lossy conversion from float to long
		float v = a;
		double w = a;


		// System.out.println(s);
		// System.out.println(t);
		// System.out.println(u);
		System.out.println(v);
		System.out.println(w);



	}
}