package SetsandMaps;

import Array.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S08 {
    public static void main(String[] args) {
        //Asagıda key olarak ürün adlarını ve value olarak ürün sayısını !çeren b!r map
        //bulunmaktadır. Ürün sayilarini artan sırada yazdırınız.

        Map<String,Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Object[] productNumber = product.values().toArray();
        System.out.println(Arrays.toString(productNumber));

        Arrays.sort(productNumber);
        System.out.println(Arrays.toString(productNumber));



    }
}
