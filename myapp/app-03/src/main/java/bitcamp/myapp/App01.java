package bitcamp.myapp;

public class App01 {
    public static void main(String[] args) {
        String bold = "\u001B[1m";
        String red = "\u001B[31m";
        String resetBold = "\u001B[0m";

        String title = "[팀 프로젝트 관리 시스템]";
        String line = "------------------------------";
        String menus1 = "1. 회원";
        String menus2 = "2. 팀";
        String menus3 = "3. 프로젝트";
        String menus4 = "4. 게시판";
        String menus5 = "5. 도움말";
        String menus6 = "6. 종료";

        System.out.println(bold +line +resetBold);
        System.out.println(bold + title + resetBold);
        System.out.println(menus1);
        System.out.println(menus2);
        System.out.println(menus3);
        System.out.println(menus4);
        System.out.println(menus5);
        System.out.println(bold + red + menus6 + resetBold);
        System.out.println(bold + line + resetBold);
    }
}
