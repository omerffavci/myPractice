package SetsandMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class S06 {
    public static void main(String[] args) {
        //Asagıda key olarak ürün adlarını ve value olarak ürün sayısını !çeren b!r map
        //bulunmaktadır. Toplam ürün sayısını bulmak !ç!n kodu yazınız.

        Map<String,Integer> product = new HashMap<>();
        product.put("Laprop",12);
        product.put("TV",53);
        product.put("Refrigerator",12);
        product.put("Music System",87);

        Collection<Integer> nP = product.values(); //Bu isleme pek de gerek yok galiba he?
        System.out.println(nP);

        int count = 0;
        int sum = 0;

        System.out.println(product.values());
        for (int w: product.values()) {
            count++;
        }
        System.out.println(count); //ürün cesidi

        for (int k : product.values()) {
            sum += k;
        } System.out.println(sum);
    }
}
