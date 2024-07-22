import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();

        int[] array = new int[size]; // 입력받은 크기만큼 배열 생성

        System.out.println(size + "개의 정수를 입력하세요:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // 사용자로부터 정수 입력받아 배열에 저장
        }

        // 배열에 저장된 값 출력
        System.out.println("입력된 배열 값:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close(); // Scanner 객체 닫기
    }
}