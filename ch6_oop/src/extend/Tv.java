package extend;

// Tv 클래스를 이용해서 Tv(인스턴스) 생성
// 객체 구성요소
// 1. 속성(특성) => 멤버변수
// 2. 기능(동작) => 멤버메소드
public class Tv {
    // 크기(int), 색상(String), 채널(int), 볼륨(int)

    int channel;
    boolean power;

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
