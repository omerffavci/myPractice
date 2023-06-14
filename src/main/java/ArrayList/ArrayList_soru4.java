package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_soru4 {
    public static void main(String[] args) {
        //Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        //Ben bir isim listesi olusturacagim, siralamayi önemsemeden...

        List<String> isimler = new ArrayList<>();
        isimler.add("Ufuk");
        isimler.add("Ali");
        isimler.add("Salih");
        isimler.add("Bedir");
        isimler.add("Mehmet");
        isimler.add("Ahmet");
        isimler.add("Zeki");

        /*Collections.sort(isimler,Collections.reverseOrder());  bu kodu eklersek olusturdugumuz
        Listeyi tersten siralar ve nihayetinde consolda "Olusturdugumuz liste azalandir" ibaresi görülür
         */

        List<String> siraliIsimler = new ArrayList<>();
        siraliIsimler.addAll(isimler); // List<String> siraliIsimler = new ArrayList<>(isimler); >> KISAYOL!!!
        Collections.sort(siraliIsimler);

        System.out.println(isimler);
        System.out.println(siraliIsimler);

        int flag = 0;

        for (int i = 0; i < isimler.size(); i++) {
            if (siraliIsimler.get(i).equals(isimler.get(isimler.size()-1-i))){
                flag++;
            }

        } if (flag== isimler.size()){
            System.out.println("Olusturdugumuz liste azalandir");

        }else {
            System.out.println("Olusturdugumuz liste azalan degildir");
        }
    }
}
