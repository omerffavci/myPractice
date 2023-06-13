package Loooop;

import java.util.Scanner;

public class Loop17_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Fibonacci sayısı yazdırmak istiyorsunuz? ");
        int n = scanner.nextInt();
        int sayi1 = 0;
        int sayi2 = 1;
        int sonuc = 0;
        System.out.println(sayi1);
        System.out.println(sayi2);

        for (int i = 2; i < n ; i++) {
            sonuc = sayi1+sayi2;
            sayi1 = sayi2 ;
            sayi2 = sonuc;
            System.out.println(sonuc);

        }
    }
}
