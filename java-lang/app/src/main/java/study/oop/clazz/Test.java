package study.oop.clazz;

public class Test {
  int result = 0;
  static void m1(int a) {
    int b;
    b = 200;
  }
  void m2(int a)  {
    // Test this;
    int b;
    b = 300;
  }
}

class Test0k {
  public static void main(String[] args) {
    Test.m1(100);

    Test obj = new Test();
    obj.m2(100);

    String s;
  }
}
