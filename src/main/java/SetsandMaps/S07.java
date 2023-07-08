package SetsandMaps;

import java.util.HashMap;
import java.util.Map;

public class S07 {
    public static void main(String[] args) {

        //Asagıda key olarak ürün adlarını ve value olarak ürün sayısını !çeren b!r map
        //bulunmaktadır. Ürünler arasında " Laptop " olup olmadıgını kontrol etmek !ç!n kodu
        //yazınız

        Map<String,Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        if (product.containsKey("Laptop")){
            System.out.println("Laptop var icinde");

        } else {
            System.out.println("Yok");
        }
    }
}
