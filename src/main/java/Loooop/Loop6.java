package Loooop;

import java.util.Scanner;

public class Loop6 {
    //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
    // Örneğin; 'Ali Can?' ==> l*i*a*n*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isim soyisim giriniz");
        String isim = scan.nextLine();
        isim = isim.replaceAll("[^a-z]","");
        String bos = "";

        for (int i = 0; i < isim.length(); i++) {
            bos = isim.substring(i,i+1);
            System.out.print(bos+"*");
        }
    }
}
