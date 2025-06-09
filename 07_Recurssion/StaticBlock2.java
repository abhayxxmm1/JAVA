class StaticBlock2
{
	static int a;
	static
	{
		System.out.println(a);
		System.exit(0);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello world");	
	}
	public static void test()
	{
		System.out.println("from test");
	}
}