class ServerDBDriver //Method Chaining
{
	public static void main(String[] args) 
	{
		Server s1 = new Server()	;

		s1.name = "Apache Tomcat"
		s1.portNo = 3030
		s1.ip = "101.2334.343"
		s1.status = "on"

		s1.getServerDetails().setDB("MYSQL", "ROOT", "Root").getDBDetails()
	}
}