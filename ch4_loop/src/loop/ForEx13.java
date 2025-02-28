package loop;

public class ForEx13 {
    public static void main(String[] args) {
        // 1 ~ 100 사이의 소수 구하기
        // 소수 : 1과 자지자신을 제외한 어떤 수로도 나누어 지지 않는다

        int cnt = 0;
        for (int i = 2; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 2) {
                System.out.printf("%d ", i);
            }
            cnt = 0;
        }
    }
}
