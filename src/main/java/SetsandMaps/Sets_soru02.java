package SetsandMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets_soru02 {
    public static void main(String[] args) {
        // Set ve L!ste arasındak! ortak ögeler! yazdırmak !ç!n kod yazınız.
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(2);
        myList.add(13);
        myList.add(98);
        myList.add(45);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);
        mySet.add(31);
        mySet.add(2);
        mySet.add(77);
        mySet.retainAll(myList);
        System.out.println(mySet);
    }
}
