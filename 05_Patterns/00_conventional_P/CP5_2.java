class CP5_2
{
	public static void main (String[]args)
	{
		int n = 11;
		for (int i=0; i<n; i++) 
		{
			for (int space=0; space<n-i-1; space++) 
			{
				System.out.print(" "+" ");	
			}
			
			for (int star=0; star<n; star++) 
			{
				System.out.print("*"+" ");	
			}
			System.out.println();
		}
		
	}
}
/*
                    * * * * * * * * * * * 
                  * * * * * * * * * * * 
                * * * * * * * * * * * 
              * * * * * * * * * * * 
            * * * * * * * * * * * 
          * * * * * * * * * * * 
        * * * * * * * * * * * 
      * * * * * * * * * * * 
    * * * * * * * * * * * 
  * * * * * * * * * * * 
* * * * * * * * * * * 
*/