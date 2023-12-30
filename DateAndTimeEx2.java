package practice;

import java.time.LocalDate;

public class DateAndTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 8, 14);
        System.out.println(date.getDayOfWeek());
    }
}
