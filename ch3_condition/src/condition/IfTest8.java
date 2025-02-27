package condition;

import java.util.Scanner;

public class IfTest8 {
    public static void main(String[] args) {
        // 임금 구하기

        // 시간당 임금
        int rate = 9800;
        int pay, hours;

        // 사용자로부터 근무시간을 입력받아 hours 변수에 담기
        Scanner scanner = new Scanner(System.in);
        System.out.println("근무시간 입력");
        String input = scanner.nextLine();
        hours = Integer.parseInt(input);

        // 근무시간이 8시간 까지는 시간당 임금을 지불함
        // 8시간 초과 근무시에는 시간당 임금의 1.5배 지불함
        // 임금 계산 후 pay 변수에 담기

        // 10 시간 : 8 * 9800 + 2 * 9800 * 1.5
        if (hours <= 8) {
            pay = rate * hours;
        } else {
            pay = (rate * 8 + (int)((hours - 8) * rate * 1.5));
        }
        
        // 최종 출력
        // 받는 임금은 1200000
        System.out.printf("받는 임금은 %d", pay);
    }
}
