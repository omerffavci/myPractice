package Loooop;

import java.util.Scanner;

public class Loop16_fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Fibonacci sayısı yazdırmak istiyorsunuz? ");
        int n = scanner.nextInt();

        // İlk iki Fibonacci sayısını tanımlayalım
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // İlk n Fibonacci sayısını hesaplayalım ve yazdıralım
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.println("Fibonacci Sayıları:");
        for (int num : fibonacci) {
            System.out.println(num);
        }
    }
}




        /*Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz ?"); int number = scan.nextInt();
        int fibo1 = 1, fibo2 = 1;
        int fibonacci = 0; System.out.print(fibo1 + " "); System.out.print(fibo2 + " ");
        for (int i = 1; i < number-1; i++) {
            fibonacci = fibo1 + fibo2; fibo1 = fibo2;

            fibo2 = fibonacci; System.out.print(fibonacci + " ");
         */

