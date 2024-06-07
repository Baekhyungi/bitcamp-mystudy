package study.lang.operator;

public class Test02 {
  public static void main(String[] args) {

    byte b1 = 100;
    byte b2 = 20;
    byte b3;

    b3 = 100 + 20;
    b3 = (byte) (b1 + b2);
    System.out.println(b3);

    int r = b1 + b2;

    char c = 20;
    short s = 30;
    // short r2 = c + s;

    long i1 = 22_0000_0000L;
    long i2 = 21_0000_0000L;
    long i3 = i1 + i2;

    System.out.println(i3);

  }
}
