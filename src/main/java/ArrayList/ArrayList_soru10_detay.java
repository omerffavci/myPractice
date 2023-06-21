package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_soru10_detay {
    //Bir String listesinde verilen ard arda gelen sayilar arasindaki en kücük ve en büyük farklari bulun
    //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 4.74 ve 30.85
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");

        ArrayList<Double> empty = new ArrayList<>();

        for (String w: myList) {
            double prices = Double.valueOf(w.replace("$",""));
            empty.add(prices);

        }
        System.out.println(empty);
        Collections.sort(empty);
        System.out.println(empty);

        double min = empty.get(1)- empty.get(0);
        double max = empty.get(1)- empty.get(0);
        for (int i = 2; i < empty.size() ; i++) {
            min = Math.min(min, empty.get(i)- empty.get(i-1));
            max = Math.max(max, empty.get(i)- empty.get(i-1));
        }
        System.out.println("min = " + min+" and "+ "max = "+max);
    }
}
