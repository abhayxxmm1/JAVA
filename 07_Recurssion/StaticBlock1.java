class StaticBlock1
{
	static 
	{
		System.out.println("from static Block 1");
	}
	static 
	{
		System.out.println("from static Block 2");
	}
	static 
	{
		System.out.println("from static Block 3");
	}
	public static void main (String[]args)
	{
		System.out.println("from main () ");
	}
	static 
	{
		System.out.println("from static block 4");
	}
}