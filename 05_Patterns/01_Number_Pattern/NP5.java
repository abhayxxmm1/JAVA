class NP5
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch = 'a';
		int num;
		for (int i=1; i<=n; i++) 
		{
			num = i;
			for (int j=1; j<=n; j++) 
			{
				System.out.print(num+" ");
				num+=4;
			}		
			System.out.println();
		}	
	}
}
// 1 5 9 13 
// 2 6 10 14 
// 3 7 11 15 
// 4 8 12 16 