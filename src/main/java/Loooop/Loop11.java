package Loooop;

import java.util.Scanner;

public class Loop11 { //Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("m iceren bir seyler yaz");
        String b = scan.nextLine();
        String sonuc = "";

        for (int i = 0; i < b.length(); i++) {
            String q = b.substring(i,i+1);
            if (q.equals("m")){
                break;
            }
            sonuc += q;

        }
        System.out.println("sonuc = " + sonuc);
    }
}
