package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        // Member => 남자 멤버의 나이 평균
        List<Member> members = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FEMALE, 20),
                new Member("김정환", Member.MALE, 45),
                new Member("성춘향", Member.FEMALE, 27));

        int age = 0, count = 0;
        for (Member member : members) {
            if (member.getGender() == Member.MALE) {
                age += member.getAge();
                count++;
            }
        }

        System.out.println("남자 멤버 나이 평균 : " + (age / count));

        // 스트림 처리
        // filter(Predicate<Member> predicate)
        double ageAvg = members.stream()
                .filter((member) -> member.getAge() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("남자 멤버 나이 평균 : " + ageAvg);
    }
}
