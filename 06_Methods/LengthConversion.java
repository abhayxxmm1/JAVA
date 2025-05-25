class LengthConversion // chaining of method like train
{
	public static void main (String [] args)
	{
		System.out.println("main begin");
		centimeterToMeter(1000);
		System.out.println("main ends");
	}
	public static void centimeterToMeter(double cent) 
	{
		System.out.println("cm to meter begin");
		double mtr = cent/100;

		System.out.println(mtr + "mtr");
		meterToInch(mtr);

		System.out.println("cm to m end");
	}
	public static void meterToInch(double mtr) 
	{
		System.out.println("mtr to inch begin");		
		double inch = mtr * 39.370;

		System.out.println(inch+"inch");
		inchToFoot(inch);

		System.out.println("mtr to inch eend");
	}
	public static void inchToFoot(double inch) 
	{
		System.out.println("inch to foot begin");	
		double foot = inch/12;

		System.out.println(foot +"foot");
		System.out.println("inch to foot end");
	}
}