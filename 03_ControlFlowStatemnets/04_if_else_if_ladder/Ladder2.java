class Ladder2
{
	public static void main (String [] args)
	{
		char ch = 'b';

		if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("lower case");
		}
		else if( ch >= 'A' && ch <= 'Z')
		{
			System.out.println("UPPER CASE");
		}
		else if( ch >= '0' && ch <= '9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}
}