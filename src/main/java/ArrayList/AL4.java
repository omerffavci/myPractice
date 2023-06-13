package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AL4 {
    //Example 1: Bir tane Integer List olusturunuz
    //           Bu List'te birbirine en yakin ardisik iki tamsayiyi yaziniz
    //           [12, 23, 10, 19] ==> 12 and 10
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(30);
        sayilar.add(28);
        sayilar.add(50);
        sayilar.add(47);
        sayilar.add(60);
        sayilar.add(71);
        sayilar.add(70);
        System.out.println(sayilar);
        Collections.sort(sayilar);

        int min = sayilar.get(1)- sayilar.get(0);


        for (int i = 1; i < sayilar.size(); i++) {
            min = Math.min(min,sayilar.get(i)-sayilar.get(i-1));

        }
        System.out.println(min);
        for (int j = 1; j < sayilar.size(); j++) {
            if (min == sayilar.get(j)-sayilar.get(j-1)){
                System.out.println(sayilar.get(j-1)+" ve "+sayilar.get(j)+" birbirine en yakin sayilar");
            }

        }


    }
}
