package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_soru7 {
    //Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
    // Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(31);
        sayilar.add(15);
        sayilar.add(13);
        sayilar.add(54);

        Collections.sort(sayilar,Collections.reverseOrder()); //Reverse Order ile cözüm denemesi
        System.out.println(sayilar);
        int min = sayilar.get(0)-sayilar.get(1);

        for (int i = 2; i < sayilar.size(); i++) {
            min = Math.min(min, sayilar.get(i-1)-sayilar.get(i));
        }
        System.out.println(min);

        for (int i = 2; i < sayilar.size(); i++) {
            if (min == sayilar.get(i-1)-sayilar.get(i)){
                System.out.println(sayilar.get(i)+" and "+sayilar.get(i-1)+" are closest");
            }

        }
    }
}
