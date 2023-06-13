package Tersten_yazdir;

public class ForLoop {
    public static void main(String[] args) {
        String s = "Java güzeldir";
        String h = "";
        String u = "Java güzeldir kardes";

        for (int i = s.length()-1; i >=0 ; i--) {
            h += s.charAt(i);


        }
        System.out.println(h);

        if (s.equalsIgnoreCase(u)) {

        }
    }
}
