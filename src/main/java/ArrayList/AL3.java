package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AL3 {
    //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz

    public static void main(String[] args) {
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for (double w: prices){
            if (prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.println(w);

            }
        }

        //Ornek 2: Bir listte tekrarli eleman olup olmadigini bulan kodu yaziniz

        List<Integer> heights = List.of(3, 13, 33, 54, 90, 13, 90);
        int count = 0;

        for (int k : heights){
            if (heights.indexOf(k)!=heights.lastIndexOf(k)){
                count++;
            }
        }
        System.out.println(count); // count 4 sonucunu verdi oysa bizim 2 tane tekrar eden elemanimiz var
        //Bir listte tekrarli eleman olup olmadigini bulan kodu yaziniz

        List<Double> ondaliklilar = new ArrayList<>();
        ondaliklilar.add(10.56);
        ondaliklilar.add(10.52);
        ondaliklilar.add(10.53);
        ondaliklilar.add(10.54);
        ondaliklilar.add(10.55);
        ondaliklilar.add(10.50);
        ondaliklilar.add(10.52);
        ondaliklilar.add(10.53);

        Set<Double> uniqueNum = new HashSet<>(); //Set cinsinden ArrayList icine her bir elemandan 1 tane alir
        int sayac = 0;

        for (double z : ondaliklilar){
            if (!uniqueNum.add(z)){ //if body sadece true iken calisir. add(z) methodu ayni eleman gelince false verir.
                                    // ! onu tekrar true yapar ve body calisir. 2 tane tekrar edenimiz var.
                sayac++;
            }
        }
        System.out.println(sayac);



    }
}
