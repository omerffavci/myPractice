package Loooop;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        //Ornek 2: Size verilen  kucuk harfle yazilmis Stringini index i cift sayi olan characterlerini buyuk harfe donusturunuz
        //          ankara  ==> AKR

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = scanner.nextLine();



        for (int i = 0; i < kelime.length(); i++) {
            if (i%2==0){System.out.print(kelime.toUpperCase().charAt(i));}
        }


    }
}

