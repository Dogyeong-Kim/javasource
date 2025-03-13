package api.util;

import java.util.ArrayList;
import java.util.List;

import api.object.Person;

public class ListEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        List<Person> list = new ArrayList<>();
        list.add(new Person("hong12", "홍길동"));
        list.add(new Person("kang12", "강길동"));
        list.add(new Person("kim12", "김길동"));
        list.add(new Person("park12", "박길동"));
        list.add(new Person("hwang12", "황길동"));

        for (Person person : list) {
            System.out.println(person); // persom.toString()
        }

        // 아이디 이름
        // -----------------------
        // hong12 홍길동

        System.out.println("아이디\t 이름");
        System.out.println("-------------------------");
        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }
    }
}
