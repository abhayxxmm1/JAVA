class CharToOthers
{
	public static void main (String[] args)
	{
		char a = 'D';

		char s = a; //error: incompatible types: possible lossy conversion from short to char
		int t = a;
		long u = a;
		float v = a;
		double w = a;


		System.out.println(s); // D
		System.out.println(t); // 68
		System.out.println(u); // 68
		System.out.println(v); // 68.0
		System.out.println(w); // 68.0



	}
}