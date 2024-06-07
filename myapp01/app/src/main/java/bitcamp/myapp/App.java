package bitcamp.myapp;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String boldAnsi = "\033[1m";
            String redAnsi = "\033[31m";
            String resetAnsi = "\033[0m";


            String title = "[팀 프로젝트 관리 시스템]";
            String line = "------------------------";
            String no1 = "1. 회원";
            String no2 = "2. 팀";
            String no3 = "3. 프로젝트";
            String no4 = "4. 게시판";
            String no5 = "5. 도움말";
            String no6 = "6. 종료";

            System.out.println(boldAnsi + line + resetAnsi);
            System.out.println(boldAnsi + title + resetAnsi);
            System.out.println(no1);
            System.out.println(no2);
            System.out.println(no3);
            System.out.println(no4);
            System.out.println(no5);
            System.out.println(boldAnsi + redAnsi + no6 + resetAnsi);
            System.out.println(boldAnsi + line + resetAnsi);

            int no;
            do {
                System.out.println("> ");
                no = scanner.nextInt();

                switch (no) {
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
                        break;
                    default:
                        System.out.println("메뉴 번호가 옳지 않습니다.");
                }
            } while (no != 6);
            System.out.println("종료합니다.");
            scanner.close();
        }

}
