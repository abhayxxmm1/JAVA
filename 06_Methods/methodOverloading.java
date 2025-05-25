class methodOverloading 
{
	public static void main(String[] args) 
	{
		add(3,3);
		add(4, 5, 6);
		add(3.0, 4);
		add('a', 'b');
	}

	public static void add(int a, int b, int c)
	{
		int res = a + b + c;

		System.out.println(res);
	}
	public static void add(double d1, double d2)
	{
		double res = d1 + d2;

		System.out.println(res);
	}
	public static void add(int a, int b)
	{
		int res = a + b;

		System.out.println(res);
	}
}
/**
 *	A class having more than one method of same name
 * where the formal argument must differ in length or type
 * ika MO.
 *
 * Q) why should we do MO?
 *	The task to perform is same but values on which
 * the task has to be performed is different then 
 * we perform MO.
 *
 * MO comes under Compile time polymorphism 
 * (Compile time binding).
 */