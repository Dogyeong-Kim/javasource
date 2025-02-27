package condition;

import java.util.Scanner;

public class IfTest7 {
    public static void main(String[] args) {
        // num1 이라는 변수 선언 후 임의의 값 담기
        // int num1 = 25;

        // 사용자로부터 입력을 받아 num1 이라는 변수에 담고
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 입력");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        // num1 이 짝수, 홀수인지 출력하기
        // num1 % 2 == 0

        if ((num1 % 2) == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
