package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_soru5 {
    public static void main(String[] args) {
        //Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        //Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(11);
        sayilar.add(15);
        sayilar.add(34);
        sayilar.add(43);
        sayilar.add(15);
        System.out.println(sayilar);

        if (sayilar.contains(15)){
            for (int w: sayilar) {
                if (w==15){
                    int idx = sayilar.indexOf(15);
                    sayilar.set(idx,51);
                }

            }
        } else {
            System.out.println("Liste 15 icermiyor");
        }
        System.out.println(sayilar);
    }
}
