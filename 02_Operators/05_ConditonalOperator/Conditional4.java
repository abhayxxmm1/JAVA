class Conditional4
{
	public static void main (String[] args)
	{
		int n1 = 234;
		int n2 = 457;
		int n3 = 800;

		int large = n1 > n2 ? n1 :n2;
		int larger = large > n3 ? large : n3;
		System.out.println(larger);
	}
}