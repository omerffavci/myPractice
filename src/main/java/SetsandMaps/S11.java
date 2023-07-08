package SetsandMaps;

import java.util.*;

public class S11 {
    //Bel!rl! b!r l!stede tekrarlanan ögeler!n sayısı nasıl kontrol ed!l!r?
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        Map<Integer, Integer> myMap = new HashMap<>();

        for (Integer w: myList) {
            Integer numOfOccurence = myMap.get(w);
            if (numOfOccurence == null){
                myMap.put(w,1);
            }else {
                myMap.put(w,numOfOccurence+1);
            }

        } System.out.println(myMap);

        int count = 0;

        Collection<Integer> myValues = myMap.values();
        for (Integer k: myValues) {
            if (k>1){
                count++;
            }

        }System.out.println("Tekrarlanan oge sayisi " + count + " adettir");



    }
}
