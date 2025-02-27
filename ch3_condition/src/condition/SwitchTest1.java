package condition;

// switch : 조건문 if ~ else if ~ else 대체

public class SwitchTest1 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 6) + 1;
        // int num = 3;

        switch (num) {
            case 1:
                System.out.println("주사위 1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("주사위 2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("주사위 3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("주사위 4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("주사위 5번이 나왔습니다.");
                break;
            default:
                System.out.println("주사위 6번이 나왔습니다.");
                break;
        }
    }
}
