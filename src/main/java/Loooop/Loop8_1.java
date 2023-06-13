package Loooop;

public class Loop8_1 {/*Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız. (Do while ile)
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A
     */

    public static void main(String[] args) {

        int i = 0;
        do {
            String s = "";

            if (i==0){
                    for (int j = 1; j < 8; j++) {
                        s += "A";
                    }
            } else {
                s += "A";
                for (int j = 0; j < 6; j++) {
                    s += "X";
                }
            } s += "A";

            i++;
            System.out.println(s);
        } while (i<4);
    }
}
