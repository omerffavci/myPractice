package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_soru4_Detay {
    public static void main(String[] args) {
        //Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        // Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır

        List<String> renkler = new ArrayList<>();
        renkler.add("Mavi");
        renkler.add("Yesil");
        renkler.add("Kirmizi");
        renkler.add("Mor");
        renkler.add("Beyaz");
        renkler.add("Siyah");
        Collections.sort(renkler); //Listeyi kücükten büyüge siralar
        System.out.println(renkler);
        Collections.sort(renkler,Collections.reverseOrder()); //Listeyi tersten siralar
        System.out.println(renkler);
        //renkler.add("Bordo"); ifadesini eklersek console : Liste karisik

        int flag = 6+1;

        for (int i = 1; i < renkler.size() ; i++) {
            if (renkler.get(i).compareTo(renkler.get(i - 1)) > 0) {
                flag ++;
            }else if (renkler.get(i).compareTo(renkler.get(i - 1)) < 0) {
                flag --;
            }

        } if (flag == 2*renkler.size()){
            System.out.println("Liste artan");
        } else if (flag == 2) {
            System.out.println("Liste azalan");
        } else {
            System.out.println("Liste karisik");
        }
    }
}
