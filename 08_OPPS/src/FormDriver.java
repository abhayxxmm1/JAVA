class FormDriver
{
	public static void main(String[] args) 
	{
		Form f1 = new Form("rani",22,9876543210l,"rani@gmail.com","Pune","B++",53678l);

		f1.displayForm()	;

		Form f2 = new Form();

		f2.displayForm();

		Form1 f3 = new Form1("amit",22,9876543210l,"rani@gmail.com","Pune","B++",53678l,"Qspiders");
		f3.displayForm();

	}
}