package Constructor;

public class C02_UrunlerRunner {
    public static void main(String[] args) {
        C02_Urunler c1 = new C02_Urunler("Kalem",true,2020,"FaberCastell");
        C02_Urunler c2 = new C02_Urunler("Suluk",false,2015,"Irony");

        System.out.println(c1.mevcut);
        System.out.println(c2);
    }



}
