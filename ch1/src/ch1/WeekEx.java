package ch1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now); // 2025-03-11

        // 요일에 따라 특정 숫자 반환
        // 월(1) ~ 일(7)
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek.getValue()); // 2

        Week today = null;
        // Week.SATURDAY
        switch (dayOfWeek.getValue()) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNESDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;

            default:
                break;
        }
        System.out.println("오늘요일은 : " + today);

        if (today == Week.SUNDAY) {
            System.out.println("게임을 합니다.");
        } else {
            System.out.println("공부를 합니다.");
        }
    }
}
