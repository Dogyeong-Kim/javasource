package oop;

public class SingletonEx {
    public static void main(String[] args) {
        // Singleton singleton = new si;
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2 ? "같은 객체" : "다른 책체");

        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1 == student2 ? "같은 객체" : "다른 책체");
    }
}
