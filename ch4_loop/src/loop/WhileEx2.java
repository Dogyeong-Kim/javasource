package loop;

// 반복문 - for, while, do-while
// 반복적으로 실행해야 하는 코드를 간단하게 처리

public class WhileEx2 {
    public static void main(String[] args) {

        int i = 1;
        while (i < 11) {
            System.out.println(i + "   ");
            i++;
        }
        System.out.println();

        i = 10;
        while (i > 0) {
            System.out.println(i + "   ");
            i--;
        }

        System.out.println();

        i = 1;
        while (i < 11) {
            if (i % 2 == 0) {
                System.out.println(i + "   ");
                i++;
            }
        }

        System.out.println();

        i = 2;
        while (i < 11) {
            System.out.println(i + "   ");
            i += 2;
        }
    }
}
