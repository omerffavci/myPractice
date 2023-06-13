package SSG_TypeCasting;

import java.util.Scanner;

public class C02_typeCasting {
    //kullicindan bir karakter aliniz ve
    //aldiginiz karakterin sayisal degerini yazdiriniz
    //charlar kolay yon degistirdigi icin direkt olarak inte girebilir ama tam tersi duruma benim zorlamam gerekir
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        int sayi=scan.next().charAt(0);
        System.out.println(sayi);
        //char karakter=scan.next().charAt(0);
        //System.out.println((int)karakter);//97
    }
}
