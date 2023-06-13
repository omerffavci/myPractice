package Loooop;

public class Loop8 {
    /*Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız. 
A A A A A A A A
A X X X X X X A
A X X X X X X A 
A X X X X X X A
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            String s = "";
            if (i==0){
                for (int j = 1; j < 8; j++) {
                    s += "A";
                }

            }else {
                s += "A";
                for (int j = 0; j < 6; j++) {
                    s += "X";

                }

            } s += "A";
            System.out.println(s);

        }
    }
}
