class CP9_1 // for odd half n/2 11/2->5
{
	public static void main (String[]args)
	{
		int n = 15;
		int inc=1;
		for (int i=1; i<=n; ) 
		{
			for (int j=1; j<=inc; j++) 
			{
				if(i%2!=0)
				{
					System.out.print("*"+"  ");
				}	
				else
				{
					System.out.print("  "+"*");
				}
			}
			System.out.println();

			i++;

			if (i%2!=0 && i<=(n/2)+1) 
			{
				inc++;
			}
			else if(i%2==0 && i>(n/2)+1)
			{
				inc--;
			}
			
		}
	}
}
/*
*  
  *
*  *  
  *  *
*  *  *  
  *  *  *
*  *  *  *  
  *  *  *  *
*  *  *  *  
  *  *  *
*  *  *  
  *  *
*  *  
  *
*  

*/