// 애노테이션 프로퍼티
package study.annotation.ex1;

public @interface MyAnnotation2 {

  // 프로퍼티를 정의할 수 있다.
  // => 인터페이스에서 메서드를 정의하는 것과 유사하다.
  // => 메서드 이름은 프로퍼티(변수)명처럼 작성한다.
  //    즉 일반적인 메서드는 보통 동사로 이름을 시작하지만,
  //    애노테이션은 명사(명사구)로 이름을 짓는다.
  // => 값을 꺼낼 때, 메서드 호출로 꺼낸다.
  // => 애노케이션에서 값을 설정할 때는
  //    다음과 같이 변수 형태를 사용한다.
  //       value="hello"
  //    그래서 프로퍼티의 이름을 변수 형태로 짓는 것이다.
  //    즉, getValue 가 아니라 value라고 한다.
  String value(); // 애노테이션의 기본 프로퍼티이다.

}


