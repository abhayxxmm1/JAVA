class Circle
{
	public static void main(String[] args) 
	{
		float radius = 5.5f ; // need to write f bcoz double is by default considered
		final float PI = 3.147f ;
		float areaOfCircle = PI * radius * radius ;

		System.out.println("Area of circle for radius : "+radius+
							"cm, is "+areaOfCircle+"cm^2");

		float perimeterOfCircle = 2*PI*radius;
		System.out.println("perimeter of circle : "+ perimeterOfCircle+"cm");
	}
}	