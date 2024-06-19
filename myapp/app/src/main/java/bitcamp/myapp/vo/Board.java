package bitcamp.myapp.vo;

import java.util.Date;


//  메모리 설계도
public class Board {

    // Non-static(field; 변수) = 인스턴스(instance)필드
    // => new 명령을 통해 Heep 메모리에 생성된다.

    private String title;
    private String content;
    private Date createdDate;
    //   private LocalDateTime createdDate;
    private int viewCount;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Date getCreatedDate() {
        return createdDate;
    }

//    public String getCreatedDate() {
//        if (createdDate == null) {
//            return null;
//        }
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        return createdDate.format(formatter);
//    }


    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

//    public void setCreatedDate(LocalDateTime createdDate) {
//        this.createdDate = createdDate;
//    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}