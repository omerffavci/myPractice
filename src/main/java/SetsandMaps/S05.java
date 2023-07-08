package SetsandMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S05 {
    public static void main(String[] args) {
        //B!r l!stede tekrarlanan ögeler olup olmadıgını kontrol etmek !ç!n kodu yazınız.
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> mySet = new HashSet<>(myList);
        if (mySet.size()<myList.size()){
            System.out.println("Tekrarlanan öge var");

        }else {
            System.out.println("Tekrarli öge yok");
        }
    }
}
