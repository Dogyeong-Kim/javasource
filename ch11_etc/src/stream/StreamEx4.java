package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신민철", "홍길동");

        // 중복 제거 후 출력
        // 1) Set 2) Stream
        Set<String> set = new HashSet<>(names);
        System.out.println(set);

        names.stream().distinct().forEach(n -> System.out.println(n));

        // 신씨 성을 가진 사람 출력
        names.stream()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));

        // 중복제거 후 신씨 성 가진 사람 출력
        names.stream()
                .distinct()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));

        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");
        // 대문자로 변경 후 출력
        for (String f : fruits) {
            System.out.println(f.toUpperCase());
        }
        // 대문자 변경 후 새로운 리스트로 생성
        List<String> list1 = new ArrayList<>();
        for (String f : fruits) {
            list1.add(f.toUpperCase());
        }
        System.out.println(list1);

        // stream 이용
        // Function<String ? extends Object> mapper
        List<String> list2 = fruits.stream()
                .map(f -> f.toUpperCase())
                .collect(Collectors.toList());

        // Stream 생성
        // IntStream.range(0, 0)
        // of(T... values) : 가변
        // of(T t)
        Stream<File> stream = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
        // 확장자를 출력(중복된 확장자는 제외) - txt, bak, java

        // 추출된 확장자 담기
        Set<String> extSet = new HashSet<>();
        stream.forEach(f -> {
            // 확장자 추출
            int pos = f.getName().indexOf(".");
            if (pos != -1) {
                String ext = f.getName().substring(pos + 1);
                extSet.add(ext);
            }
        });
        System.out.println(extSet);

        // stream
        stream = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
        stream.map(f -> f.getName()) // ["file1.txt", :file2.txt"...]
                .filter(f -> f.indexOf(".") > -1) // "file1.txt", :file2.txt", "file4.bak", "file5.java"
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // txt, txt, bak, java
                .distinct() // txt, bak, java
                .forEach(f -> System.out.println(f));

    }
}
