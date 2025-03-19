package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter // 모든 멤버변수의 setter 메소드 작성
@ToString
public class Person {
    private String pno;
    private String name;
    private String tel;

}
