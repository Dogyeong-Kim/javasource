package condition;

public class IfTest5 {
    public static void main(String[] args) {
        // 주사위 1 ~ 6

        // 0.14513347445506108
        // 0.2908560046632317
        // 0.0 <= Math.random() < 1.0
        System.out.println(Math.random());

        // ((Math.random() * 6) : 0 ~ 5) + 1
        int num = (int)(Math.random() * 6) + 1;

        // num 이 1 이면 주사위 1번이 나왔습니다.

        if (num == 1) {
            System.out.println("주사위 1번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("주사위 2번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("주사위 3번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("주사위 4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("주사위 5번이 나왔습니다.");
        } else {
            System.out.println("주사위 6번이 나왔습니다.");
        }
    }
}
