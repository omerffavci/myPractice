package Array;

public class Array_soru2 {
    //String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
    //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
    public static void main(String[] args) {
        String [] isimler = { "Kemal", "Jonathan", "Mark", "Angie", "Veli" , "Ay"};
        int min = isimler[0].length();

        for (String w : isimler) {
            min = Math.min(w.length(), min);

        }
        for (String w : isimler) {
            if (w.length()==min){
                System.out.println(w);
            }

        }


    }
}
