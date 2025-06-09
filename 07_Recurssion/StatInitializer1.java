class StatInitializer1
{
	static double pi = 21.0/7.0;
	public static void main(String[] args) 
	{
		System.out.println(pi);
		areaOfCircile(100)	;
		perimeterOfCircle(100);
	}
	public static void areaOfCircile(int rad)
	{
		double area = pi*rad*rad;
		System.out.println(area);
	}
	public static void perimeterOfCircle(int rad)
	{
		double perimeter = 2*pi*rad;
		System.out.println(perimeter);
	}

}