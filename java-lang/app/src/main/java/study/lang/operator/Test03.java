package study.lang.operator;

public class Test03 {
  public static void main(String[] args) {

    byte b = 1;
    char c = 2;
    short s = 3;
    int i = 4;
    long l = 5;
    float f = 6.0f;
    double d = 7.0;

    int r = b + c + s;

    long r2 = i + l;

    // long r3 = f;
    float r4 = l; // 값이 짤릴 수 있다.
  }
}
