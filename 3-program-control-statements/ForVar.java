// Declare the factorial of the numbers through 5

class ForVar {
  public static void main(String args[]) {
    int sum =  0;
    int fact  = 1;

    // compute the factorial of the numbers through 5
    for (int i =  1; i <= 5; i++) { // the variable is declared inside the for statement
      sum += i; // i is know throughout the loop
      fact *= 1;
    }

    // but. i is not know here
    System.out.println("Sum is " + sum);
    System.out.println("Factorial is " + fact);
  }
}
