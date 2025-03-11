package poly;

public class Car2 {
    // 자동차 바퀴 장착
    Tire frontLeft = new HankookTire(6, "앞왼쪽");
    Tire frontRight = new HankookTire(2, "앞오른쪽");
    Tire backLeft = new KumhoTire(3, "뒤왼쪽");
    Tire backRight = new KumhoTire(4, "뒤오른쪽");

    int run() {
        System.out.println("[자동차가 주행중입니다.]");
        if (!frontLeft.roll()) {
            stop();
            return 1;
        } else if (!frontRight.roll()) {
            stop();
            return 2;
        } else if (!backLeft.roll()) {
            stop();
            return 3;
        } else if (!backRight.roll()) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
