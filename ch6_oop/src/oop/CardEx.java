package oop;

public class CardEx {
    public static void main(String[] args) {

        // static 으로 선언된 변수와 메소드는 클래스이름. 접근

        System.out.println("카드 너비 " + Card.width);
        System.out.println("카드 높이 " + Card.height);

        Card card = new Card();
        card.kind = "Heart";
        card.number = 7;
        // card.height = 200;

        Card card2 = new Card();
        card2.kind = "Spade";
        card2.number = 7;
    }
}
