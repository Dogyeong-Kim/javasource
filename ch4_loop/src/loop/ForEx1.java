package loop;

// 반복문 - for, while, do-while
// 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력
public class ForEx1 {
    public static void main(String[] args) {
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
       

        // 반복문 중단 : 강제 중단(break) or 조건이 false
        // 1) int i = 0; 초기화(한번만 실행)
        // 2) 조건검사 i < 5;
        // 3) 루프 안으로 진입 - 안녕하세요 출력
        // 4) 증감연산자 실행 i++ (i = 1)
        // 5) 조건검사
        // 6) 루프 안으로 진입 - 안녕하세요 출력
        // 7) 증감연산자 실행 i++ (i = 2)
        // 8) 5) ~ 7) 반복
        // ..... 증감연산자 실행 i++ (i = 5)
        //       조건검사 5 < 5 루프 중단
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }
    }
}
