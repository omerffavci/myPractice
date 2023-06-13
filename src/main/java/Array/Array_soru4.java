package Array;

public class Array_soru4 {
    //String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
    //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
    public static void main(String[] args) {
        String [] arr = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali" , "nazan"};
        String sonuc = "";

        for (String w: arr) {
            if (w.endsWith("n")||w.endsWith("k")){
                sonuc += w.toUpperCase().substring(0,1);
            }

        }
        System.out.println(sonuc);
    }
}
