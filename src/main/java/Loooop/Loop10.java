package Loooop;

public class Loop10 { //Do-while döngüsünü kullanarak
    // konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.
    public static void main(String[] args) {

        char harf = 'C';
        String result = "";
        do {
            harf--; //arasindaki diyor c yi de bir azaltmali
            result += harf;
            harf--;

        } while (harf >'A');
        System.out.println(result);
    }
}
