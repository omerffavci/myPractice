package day_03;

import java.util.Scanner;

public class if3 {
   /* Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi oluşturmak için kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.  */


    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("İşleme sokacağınız ilk sayıyı giriniz:");
            double a = scan.nextDouble();

            System.out.println("İşleme sokacağınız ikinci sayıyı giriniz:");
            double b = scan.nextDouble();

            System.out.println("İşlem işaretini giriniz:");
            String operator = scan.next();

            if (operator.equals("+")) {
                System.out.println(a + b);
            } else if (operator.equals("-")) {
                System.out.println(a - b);
            } else if (operator.equals("*")) {
                System.out.println(a * b);
            } else if (operator.equals("/")) {
                System.out.println(a / b);
            } else {
                System.out.println("Geçersiz işlem işareti!");
            }
        }
    }


