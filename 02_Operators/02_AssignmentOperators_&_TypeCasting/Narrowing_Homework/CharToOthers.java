class CharToOthers
{
	public static void main (String[] args)
	{
		char a = 'F';

		byte b = (byte)a;
		short s = (short)a;

		System.out.println(b); // 70
		System.out.println(s); // 70

	}
}