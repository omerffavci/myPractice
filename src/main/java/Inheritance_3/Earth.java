package Inheritance_3;

public class Earth {

    String isimler;
    double yaslar;
    public Earth(){
        System.out.println("Ben dünyayim gardas");
    }

    public Earth(String isimler, double yaslar) {
        this.isimler = isimler;
        this.yaslar = yaslar;
    }
    @Override
    public String toString() {
        return "Earth{" +
                "isimler='" + isimler + '\'' +
                ", yaslar=" + yaslar +
                '}';
    }
}
