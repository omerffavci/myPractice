package SetsandMaps;

import java.util.HashMap;
import java.util.Map;

public class Deneme {
    public static void main(String[] args) {
        Map<String,Integer> dene = new HashMap<>();
        dene.put("Ogrenci",350);
        dene.put("Ogretmen",35);
        dene.put("Görevli",5);

        Integer deger = dene.get("Görevli");
        System.out.println(deger);
    }
}
