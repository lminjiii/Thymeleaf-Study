package my.app.first_Project.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
@Getter
public class UserInfo {
    private String nickname;
    private String email;
    private boolean trueOrFalse;
    private List<String> hobbies; // 멀티체크박스(취미데이터 얻어오기)
    private String language; // radio-button(옵션단추) -- 오로지 결과 1개
}
