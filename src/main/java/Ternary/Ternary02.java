package Ternary;

import java.util.Scanner;

public class Ternary02 {
    /*Nested Ternary kullanarak;
    Şifreyi kontrol etmek için kodu yazınız.
            8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
            8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.*/
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("sifre giriniz");
        String sifre = scan.nextLine();

        String kontrol = sifre.length() > 8 ? (sifre.startsWith("i")? "gecerli" : "gecersiz") : sifre.startsWith("K") ? "gecerli" : " gecersiz";
        System.out.println("kontrol = " + kontrol);


    }
}
