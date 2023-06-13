package Loooop;

import java.util.Scanner;

public class Loop3 {
    //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Herhangi bir sey yazin");
        String kelime = scan.nextLine();
        String tekrarlilar = "";

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.indexOf(kelime.charAt(i)) != kelime.lastIndexOf(kelime.charAt(i))){
                tekrarlilar += kelime.charAt(i);
            }

        }
        System.out.println("tekrarlilar = " + tekrarlilar);

        String s = input.nextLine();
        String d = "";

        for(int i=0; i<s.length(); i++) {
            String c = s.substring(i,i+1);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
            if(!d.contains(c)){ d = d + c;
            }
        }
        }
        System.out.println("d = " + d);
    }
}
