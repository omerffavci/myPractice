package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    //Ornek : Kullanicinin coklu data yi bir array e yerlestirebilmesi, istedigi zaman durdurabilmesi icin gereken kodu yaziniz

        /*
        1) Kullanicidan data almak icin Scanner object olustur
        2) Coklu data yi yerlestirmek icin bir array olusturmaliyiz
        3) Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Sisteme kaydedeceginiz ögrenci sayisini giriniz");
            int numS = scan.nextInt();

            String arr [] = new String[numS];

            for (int i = 0; i < arr.length; i++) {
                System.out.println(1+i +" . ögrencinin adini giriniz");
                String isim = scan.next();
                String ad = isim;
                if (ad.equalsIgnoreCase("q")){
                    break;
                } else {
                    arr[i] = isim;
                }


            }
            System.out.println(Arrays.toString(arr));


        }
}
