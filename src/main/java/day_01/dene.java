package day_01;

public class dene {
    public static void main(String[] args) {
        String s = "   Miami 12345!!!!  ";
        int a = s.replaceAll("[^0-9A-Za-z]","").length();
        System.out.println(a);

        String m = "Marie Pele";
        String m2 = m.substring(0,m.length()-1).toUpperCase();
        System.out.println("m2 = " + m2);


    }
}
