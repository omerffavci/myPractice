package ArrayList;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List <Integer> sayilar = new java.util.ArrayList<>(); //Bir arrayListten sayi cikarma
        sayilar.add(12);
        sayilar.add(11);
        sayilar.add(10);
        sayilar.add(22);
        sayilar.add(44);
        sayilar.add(77);

        // 1. Yol

        Integer cikar = 12;
        sayilar.remove(cikar);
        System.out.println(sayilar);

        // 2. Yol

        sayilar.remove((Integer) 11);
        System.out.println(sayilar);

        // 3. Yol

        sayilar.remove(Integer.valueOf(10));
        System.out.println(sayilar);

        // 4. Yol

        sayilar.remove(sayilar.indexOf(77));
        System.out.println(sayilar);

    }
}
