package Loooop;

import java.util.Scanner;

public class Loop19 {
    /* Kullanıcıdan bir String ve bir karakter alınız.
String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter sayısını sayınız.
Boşluk karakterlerini saymayınız.
Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1, Kod,
kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String ifade giriniz");
        String yazi = scan.nextLine();
        yazi = yazi.replaceAll("\\s","");
        System.out.println("String icerisinden bir harf giriniz");
        char harf = scan.next().charAt(0);
        int count = 0;

        if (yazi.indexOf(harf)==yazi.lastIndexOf(harf)){
            System.out.println("-1");

        }else {
            for (int i = yazi.indexOf(harf)+1; i < yazi.lastIndexOf(harf); i++) {
                count++;

            } System.out.println(count);
        }

    }
}
