package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ders_sorusu {
    /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    */
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("C");
        letters.add("F");
        letters.add("K");
        letters.add("L");

        System.out.println(letters);

        int count = 0;
        int hak = 3;


        do {
            if (hak==count){
                System.out.println("Game Over");
                break;
            }

            System.out.println("Lütfen bir harf giriniz");
            Scanner scan = new Scanner(System.in);
            String girdi = scan.next().toUpperCase().substring(0, 1);

            if (letters.contains(girdi)) {
                letters.set(letters.indexOf(girdi), "Buldum!");

            } else {
                letters.add(girdi);

            }System.out.println(letters);
            count++;
        }while (true);

    }
}
