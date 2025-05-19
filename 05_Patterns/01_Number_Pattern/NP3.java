class NP3
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch = 'a';
		for (int i=1; i<=n; i++) 
		{
			for (int j=1; j<=n; j++) 
			{
				System.out.print((ch++)+" ");
			}		
			System.out.println();
		}	
	}
}
// a b c d 
// e f g h 
// i j k l 
// m n o p 
