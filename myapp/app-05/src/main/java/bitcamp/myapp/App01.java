package bitcamp.myapp;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bold = "\u001B[1m";
        String red = "\u001B[31m";
        String resetBold = "\u001B[0m";

        String title = "[팀 프로젝트 관리 시스템]";
        String line = "------------------------------";
        String [] menu = new String[]{
                "회원",
                "팀",
                "프로젝트",
                "게시판",
                "도움말",
                "종료"
        };

        System.out.println(bold + line + resetBold);
        System.out.println(bold + title + resetBold);
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == "종료") {
                System.out.printf("%s%d. %s%s\n", (bold + red), (i + 1), menu[i], resetBold);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menu[i]);
            }
        }
        System.out.println(bold + line + resetBold);

        int menuNO;
        do {
            System.out.print("> ");
            menuNO = scanner.nextInt();

            switch (menuNO) {
                case 1:
                    System.out.println("회원");
                    break;
                case 2:
                    System.out.println("팀");
                    break;
                case 3:
                    System.out.println("프로젝트");
                    break;
                case 4:
                    System.out.println("게시판");
                    break;
                case 5:
                    System.out.println("도움말");
                    break;
                case 6:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("메뉴 번호가 옳지 않습니다.");
                    break;
            }
        } while (menuNO != 6);
    }
}
