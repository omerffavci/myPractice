package Tersten_yazdir;

public class ForLoop02 {
    public static void main(String[] args) {
                //Ornek 1: 5 den 8 e kadar tamsayilarin toplamini veren kodu yaziniz
                //  5+6+7+8 ==> 26

        int a = 0;
        for (int i = 5; i < 9; i++) {
            a += i;
            System.out.println(a);

        }
        System.out.println(a);
    }
}
