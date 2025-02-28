package loop;

import java.util.Scanner;

// for, while 과의 차이는 무조건 한번은 실행(조건검사 나중)
public class DoWhileEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("메세지 입력하세요");

        String input;
        // 문자 입력받은 후 출력
        // q 입력시 반복문 종료

        do {

            System.out.println("종료를 원하면 q, Q 입력");
            System.out.print(">> ");
            input = scanner.nextLine();
            System.out.println(input);

        } while (!input.equalsIgnoreCase("q")); // ==, != => equals,

        System.out.println("프로그램 종료합니다.");
    }
}
