package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ~~DTO : Data Transfer Object - 메소드 에서 데이터를 담아서 전달하는 객체

// ~~DAO : Data Access Object

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {
    private int deptno;
    private String dname;
    private String loc;
}
