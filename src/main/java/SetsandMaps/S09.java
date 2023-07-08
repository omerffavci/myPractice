package SetsandMaps;

import java.util.*;

public class S09 {
    public static void main(String[] args) {
        //Asagıda key olarak ürün adlarını ve value olarak ürün sayısını !çeren b!r map
        //bulunmaktadır. Ürün adlarını alfabet!k sırayla yazdırınız.

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        //1. Yol

        Set<String> pName = product.keySet();
        List<String> list = new ArrayList<>(pName);
        Collections.sort(list);
        System.out.println(list);

        //2. Yol

        Object[] arr = product.keySet().toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
