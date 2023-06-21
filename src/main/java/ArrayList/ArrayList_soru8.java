package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_soru8 {
    //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
    // Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(31);
        sayilar.add(7);
        sayilar.add(13);
        sayilar.add(10);

        System.out.println(sayilar);
        for (int w: sayilar) {
            if (w==7 || w==10){
                continue;
            }else {
                sayilar.set(sayilar.indexOf(w),w+2);
            }

        }
        System.out.println(sayilar);
    }
}
