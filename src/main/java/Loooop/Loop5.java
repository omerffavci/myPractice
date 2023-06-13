package Loooop;

public class Loop5 {
    /* Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız. A
                                                                              A A
                                                                              A A A
                                                                              A A A A */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("A ");
            }
            System.out.println();

        }
        int a = 0;

        do {
            for (int k = 0; k <= a; k++) {
                System.out.print("a ");
            }
            System.out.println();
            a++;

        } while (a<4);


        int b = 0;
        while (b<4){
            for (int y = 0; y <= b ; y++) {
                System.out.print("A ");

            }b++;
            System.out.println("w");
        }
    }
}
