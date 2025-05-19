class NP4_1
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch = 'a';
		int num=1;
		for (int i=1; i<=n; i++) 
		{
			for (int j=1; j<=n; j++) 
			{
				if (i%2!=0) 
				{
					System.out.print((ch++)+" ");
				}
				else
				{
					System.out.print((num++)+" ");
				}
			}		
			System.out.println();
		}	
	}
}
// a b c d 
// 1 2 3 4 
// e f g h 
// 5 6 7 8 