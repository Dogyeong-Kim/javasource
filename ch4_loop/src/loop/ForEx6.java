package loop;

import java.util.Scanner;

public class ForEx6 {
    public static void main(String[] args) {
        // 팩토리얼 구하기
        // 입력받은 숫자의 팩토리얼 구하기
        // 4 : 4 * 3 * 2 * 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            // fact = fact * i;
            fact *= i;
        }
        System.out.printf("%d! = %d", num, fact);
    }
}
