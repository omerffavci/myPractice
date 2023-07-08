package Maps;

import java.util.Arrays;
import java.util.HashMap;

public class C01 {
    public static void main(String[] args) {
        /* Home work:
        Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1 */

        String s = "Hello Henry!";
        s = s.replaceAll("\\p{Punct}","");
        s = s.replaceAll(" ","");
        String [] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        HashMap<String,Integer> harfler = new HashMap<>();

        for (String w : arr){
            Integer occurrence = harfler.get(w);
            if (occurrence == null){
                harfler.put(w, 1);
            } else {
                harfler.replace(w,occurrence+1);
            }
        } System.out.println(harfler);
    }
}
