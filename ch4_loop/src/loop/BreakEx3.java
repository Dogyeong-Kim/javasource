package loop;

import java.util.Scanner;

public class BreakEx3 {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        int balance = 0;
        while (run) {

            System.out.println("====================================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("====================================");

            System.out.print("메뉴 번호 입력 >> ");
            int menu = sc.nextInt();

            // int amount = 0; // 예금, 출금액
            switch (menu) {
                case 1:
                    // 예금액 입력
                    System.out.print("예금액 >> ");
                    // amount = sc.nextInt();
                    // 잔액 = 잔액 + 예금액
                    // balance += amount;

                    balance += sc.nextInt();
                    break;
                case 2:
                    // 출금액 입력
                    System.out.print("출금액 >> ");
                    // amount = sc.nextInt();
                    // 잔액 = 잔액 - 출금액
                    // balance -= amount;

                    balance -= sc.nextInt();
                    break;
                case 3:
                    // 잔액 출력
                    System.out.println("잔액 : " + balance);
                    break;
                case 4:
                    run = false; // 반복문 종료
                    break;
                default:
                    break;
            }
        }
    }
}
