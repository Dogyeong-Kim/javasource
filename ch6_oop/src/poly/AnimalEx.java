package poly;

public class AnimalEx {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // Canine canine = new Canine();
        // Feline feline = new Feline();
        // Cat cat = new Cat();
        // Dog dog = new Dog();

        // 부모 = new 자식
        Animal animal = new Animal();
        Animal animal1 = new Canine();
        Animal animal2 = new Feline();
        Animal animal3 = new Cat();
        Animal animal4 = new Dog();

        // Type mismatch : cannot convert from Cat to Dog
        // Dog dog = new Cat();
    }
}
