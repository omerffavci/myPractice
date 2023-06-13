package Array;

public class Array_soru6 {
    public static void main(String[] args) {
        //Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz
        String [] arr = {"Armut", "Elma", "Üzüm", "Kiraz", "Ananas"};
        int count = 0;

        for (String w: arr) {
            if (w.startsWith("A")||w.startsWith("a")){
                count++;
            }

        }
        System.out.println(count);
    }
}
