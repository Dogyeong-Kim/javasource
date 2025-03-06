package oop;

public class Singleton {

    private static Singleton singleton = new Singleton();

    // 생성자
    private Singleton() {
    }

    static Singleton getInstance() {
        return singleton;
    }
}
