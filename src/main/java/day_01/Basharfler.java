package day_01;

import java.util.Scanner;

public class Basharfler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi giriniz");
        String isim = scanner.nextLine();

        String basharfler = isim.toUpperCase().substring(0,1)
                              +
        isim.toUpperCase().split(" ")[1].substring(0,1);
        System.out.println("basharfler = " + basharfler);
    }
}
