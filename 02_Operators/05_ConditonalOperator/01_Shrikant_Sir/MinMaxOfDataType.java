class MinMaxOfDataType
{
	public static void main(String[] args) 
	{
		// MIN_VALUE called as a RAPPER class variable
 		// MAX_VALUE called as a RAPPER class variable

		System.out.println("min : "+Byte.MIN_VALUE);
		System.out.println("min : "+Byte.MAX_VALUE); // 3 digit

		System.out.println("min : "+Short.MIN_VALUE);
		System.out.println("min : "+Short.MAX_VALUE); // 5 digit

		System.out.println("min : "+Integer.MIN_VALUE);
		System.out.println("min : "+Integer.MAX_VALUE); // 9 digit

		System.out.println("min : "+Long.MIN_VALUE);
		System.out.println("min : "+Long.MAX_VALUE); // 19 digit

		System.out.println("min : "+(Character.MIN_VALUE+0));
		System.out.println("min : "+(Character.MAX_VALUE+0));

		System.out.println("min : "+Float.MIN_VALUE);
		System.out.println("min : "+Float.MAX_VALUE); // 39 digit

		System.out.println("min : "+Double.MIN_VALUE);
		System.out.println("min : "+Double.MAX_VALUE); // 309 digit


	}
}