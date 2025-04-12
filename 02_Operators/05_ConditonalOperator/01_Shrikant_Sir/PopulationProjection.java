class PopulationProjection
{
	public static void main(String[] args) 
	{
		long currPop = 312_032_486;
		long seconds = (365*12*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long immigrant = seconds/45;

		long newpop = currPop + birth - death + immigrant;

 		System.out.println(newpop)	;

		// long currentTimeInMilliseconds = System.currentTimeMillis();
		// long currentTimeInSeconds = currentTimeInMilliseconds / 1000;

	}
}