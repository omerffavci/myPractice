package Array;

public class Array_soru5 {
    //String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
    //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
    public static void main(String[] args) {
        String [] arr = { "Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        int s = 0;

        for (String w: arr) {
            s += w.length();

        }
        System.out.println(s);

    }
}
