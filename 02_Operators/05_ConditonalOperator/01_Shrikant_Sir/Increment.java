class Increment
{
	public static void main(String[] args) 
	{
		// int a =3;		// 3(4)  4(5)  5   5(6)
		// System.out.println(a++ + a++ + a + a++)	;

		// int a =2;
		// int b = 3;		// 2(3)  3(4)  3   4  4(5)  3(4)
		// System.out.println(a++ + b++ + a + b+ b++ + a++)	;

		// int a = 3;
		// int b = a++; // b -> 3  a ->3(4)
		// int c = b++;	// c -> 3  b ->3(4)
		// 				// 4(5)  4(5)  3(4)  5   5   4
		// System.out.println(a++ + b++ + c++ + a + b + c)	;

		// int a = 3;
		// int b = a++;    // b -> 3  a ->3(4)
		// int c = a + b++;	// c->3+4->7  a-> 4 b ->3(4)
		// 				// 7(8)  4   4(5)   8   4(5)
		// System.out.println(c++ + b + a++ +  c + b++)	;

		// int a = 3;
		// int b = a++;  // a-> 3(4)
		// b = b++; 	  // b++-> 3(4) 🍑 b=3
		// 			//     4   3
		// System.out.println(a + b)	;

		// int a = 3;
		// int b = a++;  // a-> 3(4)
		// b = b++ + a++; // b++-> 3(4) + a++ -> 4(5) 🍑 b=7
		// 				// 5(6)  7(8)  6
		// System.out.println(a++ + b++ + a)	;


		int a = 2;
		int b = 3;
		System.out.println(++a + ++b);











	}
}