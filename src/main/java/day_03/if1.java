package day_03;

import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
      /*  Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
    a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodu- nuz "16 km" yazmalıdır (sayı dinamik olacak)
    b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda kodunuz "2" yazmalıdır (sayı dinamik olacak)
    c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğin- de, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Mil degeri giriniz");
        double mil = scan.nextDouble();
        if (mil>=0) {
            System.out.println("km : "+(mil*1.609));
        } else {
            System.out.println("yanlis deger girdiniz");
        }

        System.out.println("bir saniye degeri giriniz");
        double saniye = scan.nextDouble();
        if (saniye >= 0) {
            System.out.println(saniye+" saniye "+(saniye/3600)+" saat");
        } else {
            System.out.println("Yanlis giris");
        }
    }


}
