package Maps;

import java.util.HashMap;

public class C01_farkli {
    public static void main(String[] args) {
        /* Home work:
        Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1 */

        String s = "Hello Henry!";
        s = s.replaceAll("\\p{Punct}","");
        s = s.replaceAll(" ","");

        HashMap<Character,Integer> harfler = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer occ = harfler.get(c);
            if (occ == null){
                harfler.put(c,1);

            }else {
                harfler.put(c,occ+1);
            }

        }
        for (Character c: harfler.keySet()) {
            System.out.println(c+" = "+harfler.get(c));

        }
    }
}
