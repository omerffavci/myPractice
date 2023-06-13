package Loooop;

public class Loop21 {
    public static void main(String[] args) {
        //Herhangi bir döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program yazınız.
        printNumbers(10);
    }
    static void printNumbers(int n) {
        if(n > 0) {

            printNumbers(n - 1);

            System.out.print(n + " ");

        } return;
    }
}
