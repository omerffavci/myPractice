package SSG_TypeCasting;

import java.util.Scanner;

public class C01_typeCasting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        char karakter1=(char) scan.nextInt();//sayisal degeri direkt olarak chara dondurdum ve deger atamasi yaptim
        System.out.println(karakter1);//
        //int sayi= scan.nextInt();
        //System.out.println((char) sayi);//a
        //char karakter= (char) sayi;//karakter olarak dondurmesine zorladim
        //System.out.println(karakter);


    }
}
