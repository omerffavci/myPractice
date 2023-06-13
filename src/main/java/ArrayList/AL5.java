package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL5 {
    //Example 1: Bir tane Integer List olusturunuz
    //           Bu List'te birbirine en uzak ardisik iki tamsayiyi yaziniz
    //           [12, 23, 10, 19] ==> 12 and 19
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>();
        sayi.add(5);
        sayi.add(10);
        sayi.add(13);
        sayi.add(2);
        sayi.add(76);
        sayi.add(45);
        sayi.add(34);
        sayi.add(90);

        Collections.sort(sayi);
        System.out.println(sayi);

        int maxDif = sayi.get(1)- sayi.get(0);

        for (int i = 2; i < sayi.size(); i++) {
            maxDif=Math.max(maxDif, sayi.get(i)- sayi.get(i-1));
        }
        System.out.println(maxDif);
        for (int i = 2; i < sayi.size(); i++) {
            if (maxDif== sayi.get(i)- sayi.get(i-1)){
                System.out.println(sayi.get(i-1)+" and "+ sayi.get(i)+" were far away from each other.");
            }

        }

    }
}
