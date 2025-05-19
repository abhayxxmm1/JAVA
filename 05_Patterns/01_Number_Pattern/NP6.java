class NP6  // Focus on the diffrence to solve the problem
{
	public static void main(String[] args) 
	{
		int n=4;
		int evendiff = 7, odddiff = 1;
		int num;
		for (int i=1; i<=n; i++) 
		{
			num = i;

			for (int j=1; j<=n; j++) 
			{
				System.out.print(num+" ");
				
				if (j%2==0) 
				{
					num+=odddiff;	
				}
				else
				{
					num+=evendiff;
				}
			}		
			System.out.println();

			evendiff-=2;
			odddiff+=2;

		}	
	}
}
// 1 8 9 16 
// 2 7 10 15 
// 3 6 11 14 
// 4 5 12 13 