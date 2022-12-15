/*
	Try This 1-2

	This program displays a conversion 
	table of gallons to liters.

	Call this program "GalToLitTable.java"
*/

// Now refactored to convert inches to meters
class GalToLitTable {
	public static void main(String args[]) {
		double inches, meters;
		int counter;

		counter = 0;
		for(inches = 1; inches <= 120; inches++) {
			meters = inches * 39.37; // convert to liters
			System.out.println(inches + " inches is " + meters + " meters.");

			counter++; // Increment the line counter with each loop iteration
			if (counter == 12) {
				System.out.println();
				counter = 0; //reset the line counter
			}
		}
	}

}
