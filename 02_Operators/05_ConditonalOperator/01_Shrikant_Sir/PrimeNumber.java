class PrimeNumber
{
	public static void main(String[] args) 
	{
		int  num = 23;

		String op = 
		(num>1)?
		((num==2 || num==3 ||  num==5 ||  num==7)?
			(num+" is a prime"):
			((num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0)?
				(num+" is a prime"):
				(num+" is not a prime"))):
		(num+"is not a prime");

		System.out.println(op);
	}
}