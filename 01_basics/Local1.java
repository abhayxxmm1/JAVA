class Local1 
{
	public static void main(String[]args){
		System.out.println("A variable which is declared inside a block remains local to that block");
		System.out.println("& cannot be accessed outside the block .");
		int a = 100;
		System.out.println(a);  // 100
	}
	// System.out.println(a); // CTE
}