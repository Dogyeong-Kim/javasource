package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // void accept(T, t);
        // 숫자를 전달인자로 받아 출력하기
        Consumer<Integer> consumer = (i) -> System.out.println(i);
        consumer.accept(50);

        // 문자를 전달인자로 받아 출력
        Consumer<String> consumer2 = (str) -> System.out.println(str);
        consumer2.accept("안녕하세요");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        biConsumer.accept("hello", "world");

        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(15.5);

        // LongConsumer, IntConsumer

        ObjDoubleConsumer<String> objDoubleConsumer = (t, value) -> System.out.println(t + "" + value);
        objDoubleConsumer.accept("안녕하세요", 8.7);

        // Math.random() 리턴
        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.err.println(supplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

    }
}
