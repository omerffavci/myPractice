package Date_Class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateClasses {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt);

        gunler();




    }
    public static void gunler() {
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
        /* methodumuz void barindirdigi icin 'return' yerine en sona
        prin ifadesi koyduk
         */
    }

}
