// 실습
// - 이 파일을 컴파일 했을 때 나온 결과를 확인하고 그 이유를 설명하라.
//
// 결과 및 설명
// - 컴파일 오류가 발생한다.
// - public 클래스가 있는 경우 소스 파일명은 해당 클래스 이름과 같아야 한다.

public class Test2 {
}


class Y {
}


class Z {
}

/*
 * 결과는 컴파일 오류 1.public 클래스가 있는 경우 소스 파일명은 public 클래스 이름과 같아야 한다. + 1개의 소스 파일에는 public 클래스가 2개는 존재
 * 할수없다.
 * 
 * 1. 1개의 소스파일 당 1개의 클래스 블록을 두도록 한다, 장점 1. 클래스를 정의한 파일을 찾기가 쉽다.
 * 
 * but 1개의 소스파일당 여러개의 클래스 파일을 둘수도 있다.
 * 
 * 2. 파일명과 클래스명을 같게 한다.
 */