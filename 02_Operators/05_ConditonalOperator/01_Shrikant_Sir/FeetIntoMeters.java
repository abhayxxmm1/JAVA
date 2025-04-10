class FeetIntoMeters
{
	public static void main(String[] args) 
	{
		float feet = 16.5f;
		final float CON_FAC_MUL = 0.3048f;
		final float CON_FAC_DIV = 3.281f;

		float meter = feet*CON_FAC_MUL;
		float meter1 = feet/CON_FAC_DIV;

		System.out.println("enter a value for feet:"+feet);
		System.out.println(feet+" feet is: "+meter);
		System.out.println(feet+" feet is: "+meter1);

	}
}