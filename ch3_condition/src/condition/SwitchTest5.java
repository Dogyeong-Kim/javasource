package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {
        // 점수(0 ~ 100) 입력받은 후 점수에 따라 등급 출력
        // 90 이상이면 A, 80 B, 70 C, F

        // 98 / 10 = 9, 100 / 10 = 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수(0 ~ 100) 입력");
        String input = scanner.nextLine();
        int point = Integer.parseInt(input);

        switch (point / 10) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
