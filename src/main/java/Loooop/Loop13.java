package Loooop;

import java.util.Scanner;

public class Loop13 {
    /*Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
       Örnek:12133455 ´ 2+4=6 */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        long sayi = input.nextInt();
        String deger = String.valueOf(sayi);
        String sonuc = "";

        for (int i = 0; i < deger.length(); i++) {
            String a = deger.substring(i,i+1);
            if (deger.indexOf(a) == deger.lastIndexOf(a)){
                sonuc += a;
            }

        }
        System.out.println(sonuc);


    }
}
