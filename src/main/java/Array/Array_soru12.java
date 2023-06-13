package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_soru12 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz
        // ve bu arraydeki en küçük ve en büyük öğeler arasındaki farkı konsolda yazdırınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("kac sayi gireceksiniz");
        int num = scan.nextInt();

        int sayilar [] = new int[num];
        for (int i = 0; i < sayilar.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println(i+1+ ". sayiyi giriniz");
            sayilar[i] = input.nextInt();

        }
        Arrays.sort(sayilar);
        System.out.println(sayilar[sayilar.length-1]-sayilar[0]);

    }
}
