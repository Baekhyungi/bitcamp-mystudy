package study.lang.operator;

public class Test04 {
  public static void main(String[] args) {
    int r = 3 + 5 * 2;
    int r2 = 5 * 2 + 3;
    int r3 = (3 + 5) * 2;

    System.out.println(r);
    System.out.println(r2);
    System.out.println(r3);

    // 암시적 형 변환 + 연산자 우선순위
    System.out.println(3.2f + 5 / 2L);
    // 명시적 형변환 + 연산자 우선순위
    System.out.println(3.2f + (float) 5 / 2L);

  }
}
