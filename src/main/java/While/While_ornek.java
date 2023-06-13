package While;

import java.util.Scanner;

public class While_ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secenek = 1;

        while (secenek==1){
            int a;
            System.out.println("bir sayi giriniz");
            a = scan.nextInt();

            if (a%2==0){
                System.out.println("cift sayi girdiniz");
            } else {
                System.out.println("tek sayi girdiniz");
            }
            System.out.println("yeni bir sayi girmek icin 1, cikmak icin 0 yazin");
            secenek = scan.nextInt();
        }

        }
    }

