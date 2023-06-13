package Loooop;

import java.util.Scanner;

public class Loop15 {
    public static void main(String[] args) {
        //Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
        // Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir” olur,
        // kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı yönlendiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        int sonuc = 0;

        if (sayi == 0 || sayi < 0){
            System.out.println("Pozitif bir tamsayi giriniz");

        } else if (sayi==1) {
            System.out.println("1 asal degildir");

        } else {
            for (int i = 2; i < Math.sqrt(sayi) ; i++) {
                sonuc = sayi%i;
                if (sonuc == 0){
                    System.out.println(sayi +" sayisi asal degil");
                    break;
                }
            } if (sonuc!= 0){
                System.out.println(sayi +" asal sayidir");
            }
        }
    }
}
