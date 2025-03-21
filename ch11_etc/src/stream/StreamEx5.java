package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");

        Stream<String> stream = fruits.stream();
        // Consumer<? super String> action
        stream.map(s -> s.toUpperCase())
                .peek(s -> System.out.println("확인 : " + s))
                .forEach(s -> System.out.println(s));

        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
        stream2.map(f -> f.getName()) // ["file1.txt", :file2.txt"...]
                .peek(f -> System.out.print(f + " "))
                .filter(f -> f.indexOf(".") > -1) // "file1.txt", :file2.txt", "file4.bak", "file5.java"
                .peek(f -> System.out.print(f + " "))
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // txt, txt, bak, java
                .distinct() // txt, bak, java
                .forEach(f -> System.out.println(f));

        // "apple", "grape", "melon", "watermelon", "banana"
        fruits.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        System.out.println();
        fruits.stream().skip(2).limit(2).forEach(System.out::println);

        // 스트림 연결
        String[] arr1 = { "123", "456", "789" };
        String[] arr2 = { "abc", "def", "hij" };

        // 배열 => 스트림
        // Arrays.stream(arr1);
        Stream<String> stream3 = Stream.of(arr1);
        Stream<String> stream4 = Stream.of(arr2);

        Stream<String> newStream = Stream.concat(stream3, stream4);
    }
}
