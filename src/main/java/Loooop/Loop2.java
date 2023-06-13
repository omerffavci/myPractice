package Loooop;

public class Loop2 {
    /*120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız. 3 loop türünü de kullan*/
    public static void main(String[] args) {

        // For Loop cozumu
        String s = "";
        for (int i = 120; i > 10 ; i--) {
            if (i%4==0 && i%6==0){
                s += i+" ";

            }

        }
        System.out.println(s);



        //Do while Loop cozumu
        int a;
        a = 120;
        String k = "";
        do {
            if (a%4==0 && a%6==0) {
                k += a + " ";
            }
            a--;
        } while (a>10);
        System.out.println(k);



        //While Loop cozumu
        int b = 120;
        String h = "";

        while (b>10){
            if (b%4==0 && b%6==0) {
                h += b + " ";
            } b--;

        }
        System.out.println(h);

    }
}
