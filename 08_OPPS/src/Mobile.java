class Mobile
{
	String owner;
	String brand;
	String model;
	double price;
	String colour;
	int ram;
	int rom;
	String processor;
	int cameraNo;
	int cameraMegaPixel;
	int batteryMah;
	double displayInch; 

	public void displaySpeculation()
	{
		System.out.println("Welcome 😎 "+owner+" Sir");
		System.out.println("Brand 🗿 		:" + brand);
		System.out.println("Model 			:" + model);
		System.out.println("Price 💷		:" + price+" rs");
		System.out.println("Colour  		:" + colour);
		System.out.println("Ram 			:" + ram+" gb");
		System.out.println("Rom 			:" + rom+" gb");
		System.out.println("Processor 🍪 		:" + processor);
		System.out.println("Camera Number 		:" + cameraNo);
		System.out.println("Camera MP 📸 		:" + cameraMegaPixel+" Mp");
		System.out.println("batteryMah		:" + batteryMah+" Mah 🪫");
		System.out.println("Display 📲		:" + displayInch+" inch");
		System.out.println("_____________________________________");
	}
}