import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTime{
    public static void main(String[] args)  {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        LocalDate date = LocalDate.of(2021, Month.JULY, 6);
        LocalTime time = LocalTime.of(7,20);
        System.out.println(date);
        System.out.println(time);

        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime= ZonedDateTime.of(date, time, zone);
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.plusDays(1));
        System.out.println(zonedDateTime.plusWeeks(1));
        System.out.println(zonedDateTime.minusMonths(1));
        System.out.println(ZoneId.systemDefault());

        //Period for date
        Period annualy = Period.ofYears(1);
        Period everyYearAndAWeek = Period.of(1,0,7);

        //Duration for time
        Duration daily = Duration.ofDays(1);
        Duration daily_v2 = Duration.of(1, ChronoUnit.DAYS);
        Duration nano = Duration.ofNanos(1);
        Duration nano_v2 = Duration.of(1,ChronoUnit.NANOS);

        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);

    }
}
