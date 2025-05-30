class StatVariable1
{

	static int a;
	static boolean b;
	static long c;
	static float d;
	static char A;
	static String f;
	
	public static void main(String[]args)
	{
		System.out.println(a);

		test();
	}
	public static void test()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(A);
		System.out.println(f);
	}


	/**
	public static void main(String[] args) 
	{
		RecFibo.fibo(10, 0, 1)	;
		System.out.println();

		Imp.rangeOfPrime(1, 100);
		// System.out.print();
		System.out.println();
			}
	*/
}