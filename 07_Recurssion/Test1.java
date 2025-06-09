class Test1
{
	static int i;

	static double d =1.1;
	public static void main (String []args)
	{
		System.out.println(i);	//0
		i = 100;
		System.out.println(i);	// 100

		demo();
		System.out.println(i);	// -1
	}
	public static void demo()
	{
		System.out.println(i);
		i=-1;
		System.out.println(i);
	}
}