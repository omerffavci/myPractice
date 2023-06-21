package Inheritance_3;

public class Country extends Continent{
    public Country(){
        System.out.println("Country benim");
    }
    public Country(String isimler, double yaslar){
        super.isimler=isimler;
        super.yaslar=yaslar;

    }
}
