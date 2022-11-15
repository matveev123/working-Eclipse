package initialization;
//: initialization/BananaPeel.java

import util.Print;

class Banana { void peel(int i) { /* ... */ } }

public class BananaPeel {
  public static void main(String[] args) {
    Banana a = new Banana(),
           b = new Banana();
    a.peel(1);
    b.peel(2);
    System.out.println(a);
    System.out.println(b);
  }
} ///:~
