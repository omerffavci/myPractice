package Time_Class;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Time02 {
    public static void main(String[] args) {
        //Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.

        LocalTime japan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime ger = LocalTime.now(ZoneId.of("Europe/Berlin"));

        long fark = ChronoUnit.HOURS.between(japan,ger);
        System.out.println("fark = " + fark);
    }
}
