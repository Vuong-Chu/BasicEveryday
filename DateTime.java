import java.time.*;

public class DateTime{
    public static void main(String[] args)  {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalDate.of(2021, Month.JULY, 6));
        System.out.println(LocalTime.of(7,20));
    }
}