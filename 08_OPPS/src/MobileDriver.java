class MobileDriver
{
	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile();
		m1. owner = "Abhay";
		m1 .brand = "Oneplus";
		m1. model = "Nord 2T";
		m1. price = 29999;
		m1. colour = "Ceramic Black";
		m1. ram = 8;
		m1. rom = 128;
		m1. processor = "2800 Dimesity";
		m1. cameraNo = 4;
		m1. cameraMegaPixel = 48;
		m1. batteryMah = 4500;
		m1. displayInch = 6.1; 	

		m1.displaySpeculation();

		Mobile m2 = new Mobile();
		m2. owner = "Tejus";
		m2 .brand = "Apple";
		m2. model = "iphone 16";
		m2. price = 59999;
		m2. colour = "Aqua";
		m2. ram = 8;
		m2. rom = 512;
		m2. processor = "A16";
		m2. cameraNo = 4;
		m2. cameraMegaPixel = 48;
		m2. batteryMah = 5000;
		m2. displayInch = 5.6; 	

		m2.displaySpeculation();

		Mobile m3 = new Mobile();
		m3.owner = "Amit";

		m3.displaySpeculation();

		Mobile m4 = new Mobile();
		m4.owner = "Vikas";
		m4 .brand = "Vivo";
		m4. model = "Vivo v20";
		m4. price = 29999;
		m4. colour = "Ceramic Black";
		m4. ram = 8;
		m4. rom = 128;
		m4. processor = "2800 Dimesity";
		m4. cameraNo = 4;
		m4. cameraMegaPixel = 48;
		m4. batteryMah = 4500;
		m4. displayInch = 6.1; 

		m4.displaySpeculation();
	}
}