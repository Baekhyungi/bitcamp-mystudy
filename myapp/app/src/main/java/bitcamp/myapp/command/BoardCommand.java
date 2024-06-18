package bitcamp.myapp.command;

import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.vo.Board;

import java.time.LocalDateTime;

public class BoardCommand {

    private static final int MAX_SIZE = 100;
    private static Board[] boards = new Board[MAX_SIZE];
    private static int boardLength = 0;

    public static void executeBoardCommand(String command) {
        System.out.printf("[%s]\n", command);
        switch (command) {
            case "등록":
                addBoard();
                break;
            case "조회":
                viewBoard();
                break;
            case "목록":
                listBoard();
                break;
            case "변경":
                updateBoard();
                break;
            case "삭제":
                deleteBoard();
                break;
        }
    }

    private static void addBoard() {
        Board board = new Board();
        board.setTitle(Prompt.input("제목?"));
        board.setContents(Prompt.input("내용?"));
        board.setCreatedDate(LocalDateTime.now());
        board.setViewCount(0);
        boards[boardLength++] = board;
    }

    private static void listBoard() {
        System.out.println("번호 제목 작성일 조회수");
        for (int i = 0; i < boardLength; i++) {
            Board board = boards[i];
            System.out.printf("%d, %s,%s, %s\n", (i + 1), board.getTitle(), board.getCreatedDate(), board.getViewCount());
        }
    }

    private static void viewBoard() {
        int boardNo = Prompt.inputInt("게시글 번호");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return; // return을 하면 함수를 나가는 것!!
        }
        Board board = boards[boardNo - 1];
        System.out.printf("제목: %s\n", board.getTitle());
        System.out.printf("내용: %s\n", board.getContents());
        System.out.printf("작성일: %s\n", board.getCreatedDate());
        System.out.printf("조회수: %s\n", board.getViewCount());

        board.setViewCount(board.getViewCount() + 1);
    }

    private static void updateBoard() {
        int boardNo = Prompt.inputInt("게시글 번호?");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return;
        }
        Board board = boards[boardNo - 1];
        board.setTitle(Prompt.input("제목(%s)?", board.getTitle()));
        board.setContents(Prompt.input("내용(%s)?", board.getContents()));
        System.out.println("변경 했습니다.");
    }

    private static void deleteBoard() {

        int boardNo = Prompt.inputInt("게시글번호?");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return;
        }
        for (int i = boardNo; i < boardLength; i++) {
            boards[i - 1] = boards[i];

        }
        boards[--boardLength] = null;
        System.out.println("삭제 했습니다.");
    }
}
