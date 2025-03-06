package oop;

public class Student {
    // 멤버 변수, 멤버 메소드, 생성자
    // 속성 : 학번(s1024125), 이름(홍길동), 학년(1), 반(1), 전화번호(010-1234-1234),
    // 이메일(hong2@gmail.com)
    private String stuId;
    private String name;
    private int grade;
    private int classNum;
    private String phone;
    private String email;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어 줌
    // 클래스명 () {}
    // 기본 생성자
    public Student() {
    }

    // 생성자 목적
    // 멤버 변수 초기화
    public Student(String stuId, String name, int grade, int classNum, String phone, String email) {
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // int grade, int classNum - 지역변수(전달인자)
    public Student(int grade, int classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }

    // 기능 : 전화번호를 변경한다. 이메일을 변경한다. 학년을 변경한다, 반을 변경
    // 메소드 : 리턴타입 메소드명 () {}
    // 리턴(반환) 타입 : 기본타입(정수형, 불린형, 문자형, 실수형), 객체(대문자로 시작), 배열, void(리턴타입 없음)
    void changeTel(String phone) {
        // this : 멤버변수 앞, 멤버 메소드 앞
        this.phone = phone;
    }

    void changeEmail(String email) {
        this.email = email;
    }

    void changeGrade(int grade) {
        this.grade = grade;
    }

    void changeClassNum(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }
}
