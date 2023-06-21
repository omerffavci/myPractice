package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_soru10 {
    //Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
    //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");

        List<Double> fiyatlar = new ArrayList<>();

        for (String w: myList) {
            double prices = Double.valueOf(w.replace("$",""));
            fiyatlar.add(prices);
        }Collections.sort(fiyatlar);
        System.out.println("fiyatlar = " + fiyatlar);

        double toplam = fiyatlar.get(fiyatlar.size()-1)+fiyatlar.get(0);
        System.out.println("toplam = " + toplam);


    }
}
