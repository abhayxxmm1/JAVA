class Pattern1
{
	public static void main(String[] args) {
		for (int i=0; i<3; i++) {
			System.out.print("*" + " ");
		}
		for (int i=0; i<4; i++) {
			System.out.println("*");
		}

		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print("*" + " ");
			}
		System.out.println();
		}
	}
}