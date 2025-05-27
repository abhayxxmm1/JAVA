class Conversions
{
	public static void main(String[] args) 
	{
		System.out.println(decimalToBinary(23));	
		System.out.println(binaryToDecimal(10111));
		System.out.println(decimalToOctal(86));
		System.out.println(octalToDecimal(126));
		System.out.println(decimalToHex());
	}

	public static int decimalToBinary(int num)
	{
		int bin=0;
		int mul=1;

		while (num!=0)
		{
			int rem=num%2;

			if (rem%2 != 0) 
			{
				bin = mul + bin;
			}
			mul*= 10;
			num/=2;
		}
		return bin;
	}
	public static int binaryToDecimal(int num)
	{
		int dec=0;
		int raise=1;

		while (num!=0)
		{
			int last = num%10;
			if (last!=0) 
			{
				dec= dec + raise;	
			}

			raise*=2;
			num/=10;
		}
		return dec;
	}
	public static int decimalToOctal(int num)
	{
		int oct=0;
		int mul=1;

		while(num!=0)
		{
			int rem = num%8;
			oct = rem*mul + oct;

			mul*=10;
			num/=8;
		}
		return oct;
	}
	public static int octalToDecimal(int num)
	{
		int dec = 0 ;
		int raise = 1;

		while (num!=0)
		{
			int last = num%10;
			dec=last*raise + dec;

			raise*=8;
			num/=10;
		}
		return dec;
	}
	public static int decimalToHex(int num)
	{
		int hex=0;
		int mul=1;

		while(num!=0)
		{
			int last = num%16;
			if(num>=0 && num<=9)
			{
				hex = last + hex;
			}
			else
			{
				hex = ((char)last+55) + hex;
			}
			num/=16;
		}
		return hex;
	}
}