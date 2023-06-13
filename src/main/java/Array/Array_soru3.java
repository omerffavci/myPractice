package Array;

import java.util.Arrays;

public class Array_soru3 {
    //Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
    //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
    public static void main(String[] args) {
        int [] arr = {-5,18,23,-2,-56, 10};
        Arrays.sort(arr);

        int min = arr[arr.length-1];
        int max = arr[0];

        for (int w : arr) {
            if (w>=0){
                min = Math.min(w,min);
            }
            if (w<0){
                max = Math.max(w,max);}
        }
        System.out.println("en kücük pozitif deger :"+min+"\nen büyük negatif deger :"+max);
        System.out.println("*************************************************");

        //2.Yol
        int [] sayilar = {14, 23, -4, -76, 5, 0};
        Arrays.sort(sayilar);

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]<0 && sayilar[i+1]>=0) {
                System.out.println("en kücük pozitif deger :"+sayilar[i]+"\nen büyük negatif deger :"+sayilar[i+1]);
            }

        }
    }
}
