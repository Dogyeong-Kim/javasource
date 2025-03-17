package generics;

class FruitBox<T extends Fruit> extends Box3<T> {
    // FruitBox 담을 수 있는 타입 : Fruit 와 Fruit 자식들만 혀용
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}
