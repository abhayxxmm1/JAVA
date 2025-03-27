class Narrowing 
{
	public static void main (String[] args)
	{
		int i = (int) 123.123 ;
		System.out.println(i); // 123

		byte b = (byte) 123l ;
		System.out.println(b); // 123

		char ch = (char) 123l ;
		System.out.println (ch);  // d

		char ch2 = (char) 234l ;
		System.out.println(ch2) ; // extended askii character

		System.out.println((short) 'p') ;

		System.out.println((char)-550) ; // ﷚

		System.out.println((char)-55000) ; // ⤨

		System.out.println((char)46550) ; // 뗖

		System.out.println((char)50) ; // 2

		System.out.println((char)4550) ; //

	}
}