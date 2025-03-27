class LongToOthers
{
	public static void main (String[] args)
	{
		long a = 100*65 ;

		byte b = (byte)a;
		int t = (int) a; 
		char s = (char) a; 
		short s2 = (short)a;


		System.out.println(b); // 100
		System.out.println(t); // 6500
		System.out.println(s); // ᥤ
		System.out.println(s2); // 6500


	}
}