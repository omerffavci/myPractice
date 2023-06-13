package Array;

import java.util.Arrays;

public class Array_soru1 {
    /*Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
    Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
            (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10 */
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 19};
        Arrays.sort(arr);

        if (arr.length%2!=0){
            System.out.println(arr[arr.length/2]);
        } else {
            int ortaidx = arr.length/2;
            int ortael = (arr[ortaidx] + arr[ortaidx-1])/2;
            System.out.println(ortael);
        }
    }
}
