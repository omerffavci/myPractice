package ArrayList;

import java.util.ArrayList;

public class ArrayList_soru6 {
    public static void main(String[] args) {
        //Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        //Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(31);
        sayilar.add(15);
        sayilar.add(13);
        sayilar.add(54);

        if (!sayilar.contains(13) && !sayilar.contains(15)){
            System.out.println("Liste 13 ve 15'i icermiyor");

        }else {
            for (int i = 0; i < sayilar.size(); i++) {
                if (sayilar.get(i)==13){
                    sayilar.remove(i);
                    i--;

                } if (sayilar.get(i)==15){
                    sayilar.remove(i);
                    i--;
                }

            }

        }
        System.out.println(sayilar);
    }
}
