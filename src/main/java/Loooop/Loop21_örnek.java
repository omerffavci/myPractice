package Loooop;

public class Loop21_örnek {
    //Herhangi bir döngü kullanmadan 1'den 100'e kadar cift tam sayıları yazdıran bir program yazınız.

    public static void main(String[] args) {
        don(100);

    }
    public static void don(int n){
        if (n>0) {
            don(n-2);
            System.out.print(n+" ");
        } return;

    }

}
