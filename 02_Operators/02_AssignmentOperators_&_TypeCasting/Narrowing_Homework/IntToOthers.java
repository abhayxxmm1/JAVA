class IntToOthers
{
	public static void main (String[] args)
	{
		int a = 100*65;

		byte b = (byte)a;
		char c = (char)a;
		short s = (short)a;

		System.out.println(b); // 100
		System.out.println(c); // ᥤ
		System.out.println(s); // 6500


	}
}