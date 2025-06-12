class Form // constructor chaining using This call statement
{
	String name;
	int age;
	long phNo;
	String email;
	String location;
	String blood;
	long tel;
	String tempLoc;

	Form()
	{

	}

	Form(String name,int age,long phNo,String email,String loc) // all Mandatory
	{
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.email = email;
		location = loc;

	}
	Form(String name,int age,long phno,String email,String loc,String blood)
	{
		this(name,age,phno,email,loc); // Mandatory

		this.blood = blood;	// Not mandatory
		
	}
	Form(String name,int age,long phno,String email,String loc,String blood,long tel)
	{
		this(name,age,phno,email,loc,blood); // mandatory

		this.tel = tel; // Not Mandatory
		
	}

	public void displayForm()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Phone Number :"+phNo);
		System.out.println("Email :"+email);
		System.out.println("Location :"+location);
		System.out.println("Blood :"+blood);
		System.out.println("telephone Number :"+tel);
		System.out.println("temporary Location :"+tempLoc);
		System.out.println("________________________________");

	}
}