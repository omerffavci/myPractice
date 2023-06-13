package Loooop;

import java.util.Scanner;

public class Loop18 {
    /* Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır. Örneğin,
    153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir Armstrong sayısıdır.
    Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek için bir kod yazınız.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Armstrong sayisi girmeye calisin ");
        int num = input.nextInt();
        int sonuc = 0;

        for (int i = num; i > 0; i=i/10) {
            sonuc += (i%10)*(i%10)*(i%10);

        } if (sonuc==num){
            System.out.println("Tebrikler girdiginiz sayi Armstrong sayisi");
        } else {
            System.out.println("Maalesef basaramadiniz");

        }
    }
}
