package condition;

import java.util.Scanner;

public class IfTest9 {
    public static void main(String[] args) {
        // 윤년, 평년 구하기
        // 년도 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도 입력");
        String input = scanner.nextLine();
        int year = Integer.parseInt(input);

        // 입력받은 년도가 윤년인지 평년인지 출력
        // 윤년 : 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아니면
        //        or
        //        년도를 400으로 나눈 나머지가 0이면
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }
        
    }
}
