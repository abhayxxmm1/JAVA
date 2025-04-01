class ID
{
	public static void main (String [] args)
	{
		int num = 10;
		System.out.println (++num);  // 11
		System.out.println (num++); // 11
		System.out.println (num++ + ++num); // 26

		int num2 = 100;
		System.out.println(--num2);   // 99
		System.out.println (num2--); // 99

	}
}