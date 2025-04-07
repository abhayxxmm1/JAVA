class Conditional5
{
	public static void main (String[] args)
	{
		int n1 = 1234;
		int n2 = 564;
		int n3 = 1446;

		// int largest = n1>n2 ?(n1>n3 ? n1:n3) :(n2>n3 ? n2:n3);
		// int largest = (n1>n2 ? n2:n3)>n3 ?(n1>n2 ? n1:n2): n3;
		// int largest = n1>(n2>n3 ? n2:n3)? n1:(n2>n3? n2:n3);
		int large;

		int largest = (large = n1>n2? n1:n2)>n3 ? large: n3;
		System.out.println(largest);
	}
}