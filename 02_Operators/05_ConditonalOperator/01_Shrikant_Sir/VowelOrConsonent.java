class VowelOrConsonent
{
	public static void main(String[] args) 
	{
		String str = "X".toUpperCase();
		char ch = str.charAt(0); // for converting lowercase to UPPERCASE


		String op = (ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')?
					(ch+ " is a VOWEL"):
					(ch+ " is a CONSONENT")	;

		System.out.println(op) ;
	}
}