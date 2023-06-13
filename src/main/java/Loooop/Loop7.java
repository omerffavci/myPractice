package Loooop;

import java.util.Scanner;

public class Loop7 {
    //Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
    //işaretiyle yazdırmak için gereken kodu yazınız. Örneğin; 75.4238 ´ *4*2*3*8
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ondalikli bir sayi giriniz");

        double sayi = scan.nextDouble();
        String s = String.valueOf(sayi);
        s = s.substring(s.indexOf(".")+1,s.length());
        String bos = "";


        for (int i = 0; i < s.length(); i++) {
            bos += "*"+s.substring(i,i+1) ;
        }
        System.out.println("bos = " + bos);






    }


}
