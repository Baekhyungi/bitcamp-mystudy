package bitcamp.myapp.vo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//  메모리 설계도
public class Board {

    // Non-static(field; 변수) = 인스턴스(instance)필드
    // => new 명령을 통해 Heep 메모리에 생성된다.

    private String title;
    private String contents;
    private LocalDateTime createdDate;
    private int viewCount;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


    public String getCreatedDate() {
        if (createdDate == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return createdDate.format(formatter);
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}