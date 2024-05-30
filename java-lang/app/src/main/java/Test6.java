// 실습
// - 애플리케이션 아규먼트를 다음과 같이 나오도록 모두 출력하라
// $ java -classpath 클래스파일이 있는 경로 Test6 aaa bbb ccc ddd
// `aaa`
// `bbb`
// `ccc`
// `ddd`

// 결과 및 설명


class Test6 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("`" + args[i] + "`");
        }
    }
}

// 반복문을 사용하여 출력한다.
