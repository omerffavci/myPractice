package Time_Class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Time03 {
    public static void main(String[] args) {
        /* Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de doğmuştur.
        Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark nedir?
         */

        LocalDateTime ali = LocalDateTime.of(2015,2,5,10,00);
        ZonedDateTime aliz = ali.atZone(ZoneId.of("Europe/Istanbul"));

        LocalDateTime mark = LocalDateTime.of(2015,2,5,12,00);
        ZonedDateTime markz = mark.atZone(ZoneId.of("America/New_York"));

        long difference = ChronoUnit.HOURS.between(markz,aliz);
        System.out.println("difference = " + difference);

    }
}
