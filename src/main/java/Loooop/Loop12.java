package Loooop;

public class Loop12 {
    /* Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
* * * * * *
* * * * *
* * * *
* * *
* *
*  */
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = i; j <6 ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        //aynali tam tersi

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
