package loop;

import java.util.Scanner;

// for, while 과의 차이는 무조건 한번은 실행(조건검사 나중)
public class DoWhileEx1 {
    public static void main(String[] args) {
        // 컴퓨터가 1 ~ 100 사이의 임의의 수 생성 / 생성 숫자 맞추기

        Scanner scanner = new Scanner(System.in);

        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // 사용자 답변 저장

        // 1 ~ 100 사이의 정수를 입력받아서 컴퓨터 숫자 비교 후
        // 더 큰 수 입력 or 더 작은 수 입력 or 정답
        do {

            System.out.print("1 ~ 100 사이의 정수 입력 >> ");
            input = scanner.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수 입력");
            } else {
                System.out.println("더 큰 수 입력");
            }

        } while (input != answer);

        System.out.println("정답입니다. 프로그램 종료합니다.");
    }
}
