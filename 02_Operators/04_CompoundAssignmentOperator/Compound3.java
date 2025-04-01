class Compound3
{
	public static void main (String[] args)
	{
		int i = 100;

		i += 3345.345; // this one executes bcoz compiler implicitly does narrowing
		// i = (i + 3345.345 ); // CTE lossy conersion 

		System.out.println(i); // 3445
	}
}