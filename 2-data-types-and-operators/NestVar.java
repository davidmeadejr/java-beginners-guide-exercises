/*
	This program attempts to declare a variable
	in an inner scope with the same name as one
	defined in an outer scope.

	This program will not compile because
	in java you can't declare varibles with the
	same name in both the inner scope and 
	the enclosing scope.
	
*/

class NestVar {
	public static void main(String args[]) {
		int count;

		for (count = 0; count < 10; count++){
			System.out.println("This is count: " + count);
			
			int count; // Illegal!
			for (count = 0; count < 2; count ++) {
				System.out.println("This program is error!");
			}
		}
	}
} 
