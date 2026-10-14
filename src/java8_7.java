import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class java8_7 {
    public static void main(String[] args) {
        //LocalDate d=LocalDate.now();
        //System.out.println(d);
        //LocalTime t=LocalTime.now();
        //System.out.println(t);
        //LocalDateTime n=LocalDateTime.now();
        //System.out.println(n);
        LocalTime t1=LocalTime.now(ZoneId.of("Asia/Tokyo"));

        for(String s: ZoneId.getAvailableZoneIds())
        {
            System.out.println(s);
        }
        System.out.println(t1);
    }
}
