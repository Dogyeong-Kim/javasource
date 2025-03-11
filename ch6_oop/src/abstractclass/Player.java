package abstractclass;

public abstract class Player {

    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }

    // 추상메소드
    abstract void play();

    void pause() {

    }
}

class CDPlayer extends Player {

    // CDPlayer() {
    // super();
    // }

    @Override
    void play() {
        System.out.println("CD플레이어");
    }
}

class AudioPlayer extends Player {

    @Override
    void play() {
        System.out.println("Audio플레이어");
    }
}
