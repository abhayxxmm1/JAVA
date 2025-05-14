class Pattern4
{
	public static void main(String[]args)
	{
		int n = 17;
		for (int i=0; i<n; i++) 
		{
			for (int j=0; j<n; j++) 
			{
				if (i==(n-1)/4||j==(n-1)/4||i==3*(n-1)/4||j==3*(n-1)/4
					||i==j && i<(n-1)/4||i==j && i>3*(n-1)/4
					||i+j==n-1 && j<(n-1)/4 || i+j==n-1 &&  j>3*(n-1)/4
					|| i==n/2 && j==n/2
				) 
				{
					System.out.print("*" + " ");
				}			
				else 
				{
					System.out.print(" " + " ");
				}
			}	
			System.out.println();
		}
	}
}