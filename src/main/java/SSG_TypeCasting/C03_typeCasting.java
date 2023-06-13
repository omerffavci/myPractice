package SSG_TypeCasting;

import java.util.Scanner;

public class C03_typeCasting {
    //kullanicidan bir karakter alin
    //ve ascii degerinin bir fazlasinin karakter degerini yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);
        System.out.println("concat yaptigini gostermek icin : "+(char)(karakter+1));
    }
}
