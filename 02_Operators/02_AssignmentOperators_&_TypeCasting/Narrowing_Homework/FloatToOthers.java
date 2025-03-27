class FloatToOthers
{
	public static void main (String[] args)
	{
		float a = 100*65.006f;

		byte b = (byte)a;
		int t = (int) a; 
		char s = (char) a; 
		long u = (long) a; 
		short s2 = (short)a;


		System.out.println(b); // 100
		System.out.println(t); // 6500
		System.out.println(s); // ᥤ
		System.out.println(u); // 6500
		System.out.println(s2); // 6500

	}
}