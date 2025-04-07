class For4Num
{
	public static void main (String[] args)
	{
		int n1 = 1234;
		int n2 = 564;
		int n3 = 144096;
		int n4 = 23567;
		
		int largest = ((n1>n2? n1:n2)>n3 ? (n1>n2 ? n1:n2) : n3)>n4 ? ((n1>n2? n1:n2)>n3 ? (n1>n2 ? n1:n2) : n3) : n4;
		System.out.println(largest);
	}
}