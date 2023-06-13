package day_01;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir Celcius degeri giriniz");
        double cels = scan.nextDouble();
        System.out.println("cels = " + cels);
        double fahrenheit = ftoC(cels);
        System.out.println(fahrenheit);



    }
    public static double ftoC(double d){
        double deger = d*9/5+32;
        return deger;
    }
}
