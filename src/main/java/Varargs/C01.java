package Varargs;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        //Example 2: Verilen isimlerini ilk harflerin console'a yazdiran method'u olusturunuz.
        //           Ali Can ==> AC    Kemal Han ==> KH
        int i = 0;
        do {
            Scanner scan = new Scanner(System.in);
        System.out.println("Isim ve soyisim giriniz");
        String isimler = scan.nextLine();
        getInitials(isimler);
        i++;
        } while (i<4);

    }
    static String initials;
    static {
        initials = "";
    }
    public static void getInitials(String...s){

        for (String w:s){
            initials += w.toUpperCase().substring(0,1)+w.toUpperCase().split(" ")[1].charAt(0)+ " ";
            System.out.print(initials+" ");
            System.out.println("\n");

        }

    }
}
