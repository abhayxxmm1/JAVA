class RecFact
{
	public static int fact(int num)
	{
		return num==0 ? 1 : num*fact(num-1);
	}

	public static int power(int base, int raise)
	{
		return raise==0 ? 1 : base*power(base, raise-1);
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(power(5, 3));
		System.out.println(f(4));
	}
	public static int f(int num)
	{
		if(num==0)
		{
			return 1;
		}
		return num*fact(num-1);
	}
}