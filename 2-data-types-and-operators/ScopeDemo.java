// Demonstrate block scope

class ScopeDemo {
	public static void main(String args[]) {
		int x; // known to all code within main
		
		x = 10;

		if (x == 10) { // start new scope
			int y = 20;
			
			// x and y are both known here

			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		
		// y == 100; // Error! y is not known here

		// x is still know here
		System.out.println("x is " + x + ".");
	}
}
