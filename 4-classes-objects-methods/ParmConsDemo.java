// A parameterised constructor

class MyClass {
  int x;

  MyClass(int i) { // this constructor has a parameter
    x = i;
  }
}

class ParmConsDemo {
  public static void main(String args[]) {
    MyClass t1 = new MyClass(10);
    MyClass t2 = new MyClass(10);

    System.out.println(t1.x + " " + t2.x);
  }
}

