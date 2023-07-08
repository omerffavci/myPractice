package SetsandMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class S04 {
    public static void main(String[] args) {
        //B!r l!ste ve b!r set olusturunuz. Set !çer!s!nde var olan l!sten!n bütün elemanlarını kaldıran
        //b!r kod yazınız.

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

        mySet.removeAll(myList);
        System.out.println(mySet);
    }
}
