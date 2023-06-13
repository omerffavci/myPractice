package Date_Class;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateClasses_voidsiz {
    public static void main(String[] args) {
        System.out.println(gunler()); //method void'siz oldugu icin
        //yazdirmak zorunda kaldik

    }
    public static int gunler() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dogum yilinizi girin");
        int yil = scan.nextInt();
        System.out.println("Dogdugunuz ayi girin");
        int ay = scan.nextInt();
        System.out.println("Dogdugunuz günü girin");
        int gun = scan.nextInt();


        LocalDate dogum = LocalDate.of(yil, ay, gun);
        LocalDate g = LocalDate.now();
        long yasananGun = ChronoUnit.DAYS.between(dogum, g);
        System.out.println("yasananGun = " + yasananGun);

        return (int) yasananGun; /* methodun türü int oldugu icin
         ve döndürülmesi istenen var long oldugu icin hata verdi,
         bu yüzden (int) ekledik. Yani methodun var türü ile
        return edilen var türü ayni olmali */
    }
}
