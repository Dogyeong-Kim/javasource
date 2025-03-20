package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "성춘향", "김자바");

        for (String string : list) {

        }

        // Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
        }

        // Stream
        Stream<String> stream = list.stream();

        // Consumer<String> action;
        // forEach(Consumer<? super String> action) : void
        stream.forEach(s -> System.out.println(s));

        // stream has already been operated upon or closed
        // stream.forEach(s -> System.out.println(s));

        List<Student> students = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신철용", 75));

        Stream<Student> stream2 = students.stream();
        stream2.forEach(student -> {
            String name = student.getName();
            int math = student.getMath();
            System.out.println(name + " : " + math);
        });

        students.stream()
                .forEach(stu -> System.out.println(stu));
    }
}
