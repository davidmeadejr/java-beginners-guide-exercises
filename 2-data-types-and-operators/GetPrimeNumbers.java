/*
	Write a functions that returns all the prime numbers
	betwewen 2 and 100.
*/

import java.util.ArrayList;

class GetPrimeNumbers {
	public static void main(String args[]) {
		listPrimeNumbers();	
	}
		
	public static ArrayList<Integer> listPrimeNumbers() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    for (int i = 2; i <= 100; i++) {
      if ((i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) || i == 2 || i == 3 || i == 5 || i == 7) {
         numbers.add(i); 
      }
    }

    System.out.println(numbers);
    return numbers;

	}
}
