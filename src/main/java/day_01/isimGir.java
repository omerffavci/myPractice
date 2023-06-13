package day_01;

import java.util.Scanner;

public class isimGir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi aralarinda bir bosluk olacak sekilde yaziniz");
        String isim = scan.nextLine();

        String isim2 = isim.trim();
        String isim3 = isim2.replaceAll("\\s","");
        boolean b = (isim2.length()-isim3.length())==1;

        if (b==true){
            System.out.println("Adiniz basariyla kaydedildi");
        }else {
            System.out.println("Gecersiz ad girdiniz");
        }
    }
}
