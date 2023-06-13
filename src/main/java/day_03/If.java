package day_03;

import java.util.Scanner;

public class If {
    /* Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalı-
    ğa yuvarla”
    b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi%10>=5) {
            sayi = (sayi/10)*10+10;

        } else {
            sayi = (sayi/10)*10;

        }
        System.out.println("sayi = " + sayi);
    }
}
