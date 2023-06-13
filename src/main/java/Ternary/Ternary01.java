package Ternary;

import java.util.Scanner;

public class Ternary01 {
   /* Nested Ternary kullanarak Apex kodunu yazınız.
    Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız. Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
    Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir. */
   public static void main(String[] args) {
       Scanner ipt = new Scanner(System.in);
       System.out.println("Artik yil olup olmadigini görmek üzere bir sayi giriniz");
       int sayi = ipt.nextInt();

       String artik = sayi%100==0? (sayi%400==0? "artik yil" : "artik yil degil") : sayi%4==0? "artik yil" : "artik yil degil";
       System.out.println("artik = " + artik);
   }
}
