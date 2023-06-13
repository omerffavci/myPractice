package day_01;

import java.util.Scanner;

public class isimGir2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi basinda ve sonunda bosluk olmadan giriniz");
        String ad = scan.nextLine();
        boolean o = ad.indexOf('Ö')==-1;
        System.out.println(o);

        String ad2 = ad.trim();
        boolean b = ad.length()-ad2.length() > 0;

        if (b==true){
            System.out.println("Girdi basarisiz");
        }else {
            System.out.println("Girdi basarili");
        }

        // 2.YOL
        String isim = scan.nextLine();
        String trim = isim.trim();
        boolean sonuc = trim.equals(isim);
        System.out.println("basinda ya da sonunda bosluk var mi? : "+!sonuc);
    }
}
