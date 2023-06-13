package Loooop;

public class Loop14 { //5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
    public static void main(String[] args) {
        String sonuc = "";
        for (int i = 3; i < 10 ; i++) {
            if (i==5){
                continue;
            } sonuc += i;

        }
        System.out.println("sonuc = " + sonuc);
    }
}
