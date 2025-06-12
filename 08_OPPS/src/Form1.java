class Form1 // constructor Overloading
{
	String name;
	int age;
	long phNo;
	String email;
	String location;
	String blood;
	long tel;
	String tempLoc;

	Form1()
	{

	}

	Form1(String name,int age,long phno,String email,String loc) // all Mandatory
	{
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.email = email;
		location = loc;

	}
	Form1(String name,int age,long phno,String email,String loc, String blood,long tel)
	{
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.email = email;
		location = loc;
		this.blood = blood;

		this.tel = tel;
	}
	Form1(String name,int age,long phno,String email,String loc,
		String blood,long tel,String tempLoc)
	{
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.email = email;
		location = loc;
		this.blood = blood;
		this.tel = tel;
		this.tempLoc = tempLoc;
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