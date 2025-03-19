package thread;

public class BigLetters {
    public static void main(String[] args) {

        // Thread t1 = new Thread(new SmallLetters());

        // 익명구현객체
        // - 인터페이스, 추상클래스 : 구현객체를 무조건 생성한 수 사용
        // - 한번만 사용한다면 익명구현객체를 이용한다.
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                // 소문자 출력
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    System.out.print(ch + "\t");
                }
            }
        });
        t3.start();

        // 람다식
        Runnable r = () -> {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + "\t");
            }
        };
        Thread t4 = new Thread(r);

        Thread t1 = new SmallLetters2();
        System.out.println("스레드 t1 name " + t1.getName());
        t1.start();

        Thread t2 = new NumPrint();
        System.out.println("스레드 t2 name " + t2.getName());
        t2.start();

        // main 스레드명
        Thread mainThread = Thread.currentThread();
        System.out.println("스레드 main name " + mainThread.getName());

        // 대문자 출력
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + "\t");
        }
    }
}
