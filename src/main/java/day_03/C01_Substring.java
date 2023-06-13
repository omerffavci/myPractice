package day_03;
import java.util.Scanner;
public class C01_Substring {
     /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Adinizi ve soyadinizi giriniz");
         String adSoyad = sc.nextLine();



         System.out.println(adSoyad.toUpperCase().charAt(0) + adSoyad.toLowerCase().substring(1,adSoyad.indexOf(" "))+"\n"
                 + adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1) + adSoyad.toLowerCase().substring(adSoyad.indexOf(" ")+2));



     }

}

