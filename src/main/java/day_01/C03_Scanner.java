package day_01;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int kare1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int kare2 = input.nextInt();
        boolean b = kareler(kare1, kare2);
        System.out.println("b = " + b);

    }
    public static boolean kareler(int k, int s){
        boolean sonuc = k*k == s*s;
        return sonuc;



    }
}
