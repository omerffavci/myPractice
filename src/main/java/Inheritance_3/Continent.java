package Inheritance_3;

public class Continent extends Earth {
    public Continent(){
        System.out.println("I'm Continent bro");
    }
    public Continent(String isimler, double yaslar){
        super.isimler = isimler;
        super.yaslar = yaslar;
    }


}
