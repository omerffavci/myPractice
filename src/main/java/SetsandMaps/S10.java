package SetsandMaps;

import java.util.HashMap;
import java.util.Map;

public class S10 {
    public static void main(String[] args) {
        //B!r Str!ng’ dek! kel!meler!n kaç defa tekrarlandıgını !fade eden kod yazınız.
        //(Büyük/küçük harfe duyarlı deg!l)
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        s = s.replaceAll("\\p{Punct}","").toLowerCase();

        Map<String, Integer> wordOccurence = new HashMap<>();
        String[] words = s.split(" ");

        for(String w : words){
            Integer numOfOccurence = wordOccurence.get(w);
            if(numOfOccurence == null ){
                wordOccurence.put(w, 1);
            }else{
                wordOccurence.put(w, numOfOccurence+1);
            }
        }
        System.out.println(wordOccurence);
    }
}
