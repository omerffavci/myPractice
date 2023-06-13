package day_03;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
       /* Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
        a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
        b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
        c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yaz- malıdır.
        d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi" yazmalıdır.
        e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad" yazmalıdır.
           Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda görünmelidir.
           Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve "Geçersiz Ad"
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Adini soyadini gir");
        String adsoy = scan.nextLine();


        char s = adsoy.charAt(adsoy.indexOf(" ")+1);

        if (adsoy.replaceAll("\\s","").length()==0){
            System.out.println("isim girilmedi");
        } else if(adsoy.indexOf(" ")!=adsoy.lastIndexOf(" ")) {
            System.out.println("Ad soyad arasina 1 bosluk koyunuz!");
        }
        if (adsoy.charAt(0) >= 'a' && adsoy.charAt(0) <= 'z'|| s >= 'a' && s <= 'z' ) {
            System.out.println("Bas harfinde hata var");
        }
        if (!adsoy.contains(" ")) {
            System.out.println("ad ya da soyad eksik");

        }
        if (adsoy.replaceAll("[A-Za-z\\s]", "").length() > 0) {
            System.out.println("Gecersiz ad");
        }
    }
}
