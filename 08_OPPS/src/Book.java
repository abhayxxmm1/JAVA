class Book
{
	String brand;
	double price;
	int pages;
	String type;
	String bind;
	String size;
	int gsm;

	Book()
	{

	}

	public void printBook()
	{
		System.out.println("Brand "+brand);
		System.out.println("Price "+price);
		System.out.println("Pages "+pages);
		System.out.println("Type "+type);
		System.out.println("Bind "+bind);
		System.out.println("Size "+size);
		System.out.println("Gsm "+gsm);
	}
}