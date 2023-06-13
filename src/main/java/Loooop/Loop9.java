package Loooop;

public class Loop9 { //3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
    public static void main(String[] args) {
        int a = 1 ;
        for (int i = 3; i < 10 ; i++) {
            a *= i;
        }
        System.out.println(a);

        //while
        int b = 3;
        int x = 1;
        while (b<10){
            x *= b;
            b++;
        }
        System.out.println(x);

        //do
        int g = 3;
        int z = 1;
        do {
            z *= g;
            g++;
        } while (g<10);
        System.out.println(z);
    }
}
