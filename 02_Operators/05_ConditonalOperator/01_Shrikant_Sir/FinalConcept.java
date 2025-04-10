class FinalConcept
{
	public static void main(String[] args) {
		int a = 10;
		a = 20;

		System.out.println(a);

		// final is a keyWord and modifier 
		// can be used in class, variable as final it cannot be re-intialized
		// final variable are treated as COSTANTS & we cannot change them

		final int b = 1;
		// b = 20; //❌ bcoz it bcoms a constant
		System.out.println(b);

		final double PI = 3.14;
		final double GRAVITATIONAL_FORCE = 9.81; 
		// while declaring final variable we should follow 
		// the rules of identifier along with convention(ALL CHARACTER UPPERCASE)
		
	}
}