class Combined
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		String op = ((ch>=65 & ch<=90) || (ch>=97 && ch <=122)) ?
		((ch>=65 && ch<=90)?
		(ch +" is Uppercase") :
		(ch+" is Lowercase")): // oper 2
		((ch>=48 && ch<=57)?
		(ch+" is Digit"):
		(ch+" is Special Character")); // oper 3

		System.out.println(op);
	}
}