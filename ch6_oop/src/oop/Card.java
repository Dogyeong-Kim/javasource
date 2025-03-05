package oop;

// 변수 종류

// 1. 지역변수 : 메소드, 생성자, 초기화 블럭 내부 등에서 선언 / 변수 선언문이 실행될 때
// 2. 인스턴스변수 : 클래스 영역 / 닌스턴스가 생성되었을 때(new card())
// 3. 클래스변수 : 클래스 영역 / 클래스가 메모리에 올라갔을 때(클래스 작성 완료되면) 

public class Card {
    // 멤버(=인스턴스)변수
    String kind;
    int number;

    // 클래스변수
    // 폭, 높이(카드 공통속성)
    static int width = 100;
    static int height = 250;
}
