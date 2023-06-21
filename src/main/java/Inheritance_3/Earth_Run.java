package Inheritance_3;

public class Earth_Run {
    public static void main(String[] args) {

        Paris sehir = new Paris();
        Earth e = new Earth("Ahmet",34.2);
        Earth e2 = new Earth("Mehmet",56.2);

        Country country = new Country("Adem",33);

        System.out.println("---------------------");

        System.out.println(e.isimler+" "+e2.yaslar);
        System.out.println(e2.isimler);
        System.out.println(e);
        System.out.println(country);

    }
}
