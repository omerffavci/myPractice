package Date_Class;

import java.time.LocalDate;

public class DateClasses01 {
    public static void main(String[] args) {
        // Örnek : Ali'nin doğum tarihi 4 Haziran 1997'dir.
        // Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün sonraki tam tarihi bulmak için kodu yazınız.

        LocalDate dg = LocalDate.of(1995,02,07);
        LocalDate kt = dg.plusYears(2).plusDays(574).plusMonths(55);
        System.out.println("kt = " + kt);
    }

}
