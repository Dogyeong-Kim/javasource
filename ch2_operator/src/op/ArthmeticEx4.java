package op;

public class ArthmeticEx4 {
    public static void main(String[] args) {
        // % : 나머지 연산자 - 홀/짝, 배수 검사에 사용
        // 피연산자로 정수만 허용
        int x = 10, y = 8;
        System.out.printf("%d 를 %d로 나누면 \n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다 \n", x/y, x%y);
    }
}
