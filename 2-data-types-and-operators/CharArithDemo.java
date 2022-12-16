// Character variables can be handles like integers

class CharArithDemo {
	public static void main(String args[]) {
		char ch;
		
		ch = 'X';
		System.out.println("ch contains " + ch + ".");

		ch++; // increment ch (A char can be incremented)
		System.out.println("ch is now " + ch + ".");

		ch = 90; // give ch the value Z (A char can be assigned an int value.)
		System.out.println("ch is now " + ch + ".");
	}
}
