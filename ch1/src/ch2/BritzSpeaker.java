package ch2;

public class BritzSpeaker implements Speaker {

    @Override
    public void volumeUP() {
        System.out.println("BritzSpeaker volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("BritzSpeaker volumeDown");
    }

}
