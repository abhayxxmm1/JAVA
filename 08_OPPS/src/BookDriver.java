class BookDriver
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		b1.brand = "Oneplus";
		b1.price = 40000;
		b1.type = "Ruled";
		b1.bind = "Hard bound";
		b1.size = "Long";
		b1.gsm = 70;

		b1.printBook();
		System.out.println("__________________________");

		Book b2 = new Book();
		b2.printBook();
		System.out.println("__________________________");


		Book b3 = new Book();
		b3.printBook();
	}
}