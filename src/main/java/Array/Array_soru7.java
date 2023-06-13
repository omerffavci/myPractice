package Array;

import java.util.Arrays;

public class Array_soru7 {
    public static void main(String[] args) {
        // Verilen bir String'deki sesli harf sayısını bulunuz.
        String yazi = "Bu cümledeki sesli harf sayisini bulacakmisiz vay bee";
        String[] arr = yazi.toLowerCase().split("");

        int count = 0;
        System.out.println(Arrays.toString(arr));

        for (String w : arr) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    count++;
                    break;
                case "ü":
                case "ö":
                    count += 2; //ü ve ö iki harf sayilir cünkü türkce ifade
                    break;
            }
        }

        System.out.println("Sesli harf sayısı: " + count);
    }

}
