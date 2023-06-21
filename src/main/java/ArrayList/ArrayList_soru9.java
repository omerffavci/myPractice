package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_soru9 {
    //String bir listede verilen tüm fiyatların toplamını bulunuz.
    //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
    public static void main(String[] args) {
        List<String> fiyatlar = new ArrayList<>();
        fiyatlar.add("$12.99");
        fiyatlar.add("$23.60");
        fiyatlar.add("$54.45");

        double sum = 0; //Eger burasi int olsaydi her sayinin yanindaki ondalik kismi siler öyle
        //islem yapardi.

        for (String w: fiyatlar) {
            double prices = Double.valueOf(w.replace("$",""));
            sum += prices;
        }
        System.out.println("sum = " + sum);
    }
}
