package SrtingBuilder;

public class C01 {
    static String isim;

    static {
        isim = "Elif";
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(isim);
        sb.reverse();
        System.out.println(sb);

        String ad = sb.toString().toUpperCase();
        System.out.println(ad);

        StringBuilder sb2 = new StringBuilder(ad); //String'i SB ye cevirdik
        System.out.println(sb2);
    }

}
