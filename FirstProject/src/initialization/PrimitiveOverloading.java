package initialization;
import static util.Print.*;
public class PrimitiveOverloading {
  void f1(char x) { printb("f1(char) "); }
  void f1(byte x) { printb("f1(byte) "); }
  void f1(short x) { printb("f1(short) "); }
  void f1(int x) { printb("f1(int) "); }
  void f1(long x) { printb("f1(long) "); }
  void f1(float x) { printb("f1(float) "); }
  void f1(double x) { printb("f1(double) "); }

  //void f2(char x) { printb("f2(char) "); }
  void f2(byte x) { printb("f2(byte) "); }
  void f2(short x) { printb("f2(short) "); }
  void f2(int x) { printb("f2(int) "); }
  void f2(long x) { printb("f2(long) "); }
  void f2(float x) { printb("f2(float) "); }
  void f2(double x) { printb("f2(double) "); }

  void f3(short x) { printb("f3(short) "); }
  void f3(int x) { printb("f3(int) "); }
  void f3(long x) { printb("f3(long) "); }
  void f3(float x) { printb("f3(float) "); }
  void f3(double x) { printb("f3(double) "); }

  void f4(int x) { printb("f4(int) "); }
  void f4(long x) { printb("f4(long) "); }
  void f4(float x) { printb("f4(float) "); }
  void f4(double x) { printb("f4(double) "); }

  void f5(long x) { printb("f5(long) "); }
  void f5(float x) { printb("f5(float) "); }
  void f5(double x) { printb("f5(double) "); }

  void f6(float x) { printb("f6(float) "); }
  void f6(double x) { printb("f6(double) "); }

  void f7(double x) { printb("f7(double) "); }

  void testConstVal() {
    printb("5: ");
    f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5); println();
  }
  void testChar() {
    char x = 'x';
    printb("char: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); println();
  }
  void testByte() {
    byte x = 0;
    printb("byte: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); println();
  }
  void testShort() {
    short x = 0;
    printb("short: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); println();
  }
  void testInt() {
    int x = 0;
    printb("int: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); println();
  }
  void testLong() {
    long x = 0;
    printb("long: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); println();
  }
  void testFloat() {
    float x = 0;
    printb("float: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); println();
  }
  void testDouble() {
    double x = 0;
    printb("double: ");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); println();
  }
  public static void main(String[] args) {
    PrimitiveOverloading p =
      new PrimitiveOverloading();
    p.testConstVal();
    p.testChar();
    p.testByte();
    p.testShort();
    p.testInt();
    p.testLong();
    p.testFloat();
    p.testDouble();
  }
} /* Output:
5: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
char: f1(char) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
byte: f1(byte) f2(byte) f3(short) f4(int) f5(long) f6(float) f7(double)
short: f1(short) f2(short) f3(short) f4(int) f5(long) f6(float) f7(double)
int: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
long: f1(long) f2(long) f3(long) f4(long) f5(long) f6(float) f7(double)
float: f1(float) f2(float) f3(float) f4(float) f5(float) f6(float) f7(double)
double: f1(double) f2(double) f3(double) f4(double) f5(double) f6(double) f7(double)
*///:~
