package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_soru8 {
    //İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kac elemanli bir String gireceksiniz");
        int elsa = scan.nextInt();
        String [] arr = new String[elsa];

        for (int i = 0; i < elsa; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println(i+1+". ögrencinin ismini giriniz");
            String isimler = input.next();
            arr[i] = isimler;
        }  //Buraya kadar kullanicidan isimleri alip bir String Array'i olusturduk
        System.out.println(Arrays.toString(arr));
        for (String w : arr) {
            char c = w.toLowerCase().charAt(0);
            if (c == w.charAt(w.length()-1)){
                System.out.println(w);
            }

        }
    }
}
