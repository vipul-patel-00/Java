package practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

// import java.util.Date;
// import java.sql.Date;

public class DateAndTimeApiEx1 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date);
        System.out.println("***************");

        long time = date.getTime();
        long hours = date.getHours();
        java.sql.Date Date = new java.sql.Date(time);
        System.out.println(time);
        System.out.println(Date);
        System.out.println("*********************");
        java.sql.Date Date2 = new java.sql.Date(hours);
        System.out.println(hours);
        System.out.println(Date2);
        System.out.println("*********************");
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        LocalDate d1 = LocalDate.of(2002, 03, 21);
        LocalDate d2 = LocalDate.now();
        Period p = Period.between(d1, d2);
        System.out.printf("years %d Months %d Days %d", p.getYears(), p.getMonths(), p.getDays());
    }
}
