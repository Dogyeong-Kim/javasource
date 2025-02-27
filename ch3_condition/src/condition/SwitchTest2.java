package condition;

public class SwitchTest2 {
    public static void main(String[] args) {
        char grade = 'b';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원");
                break;
            default:
                break;
        }
    }
}
