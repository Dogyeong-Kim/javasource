package ch2;

public class SamsungTv implements Tv {
    @Override
    public void powerOn() {
        System.out.println("SmasungTv - 파워 On");
    }

    @Override
    public void powerOff() {
        System.out.println("SmasungTv - 파워 Off");
    }

    @Override
    public void volumeUP() {
        System.out.println("SmasungTv - volumeUP");
    }

    @Override
    public void VolumeDown() {
        System.out.println("SmasungTv - volume Down");
    }
}
