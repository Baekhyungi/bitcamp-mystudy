package study.oop.clazz;

public class Test05 {
  static class A{}
  static class B{}
  static class C{}

  static class x {
    void m1() {}
  }

  static class Y extends X {
    @Override
    void m2() {}
  }

  static class Z extends Y {
    void m3() {}
  }
}
