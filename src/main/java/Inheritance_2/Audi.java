package Inheritance_2;

public class Audi extends Car {

    public Audi() {
        this("X4",1996);
        System.out.println("Audi 1");
        System.out.println("this.km = " + this.km);
        System.out.println("this.model = " + this.model);
        System.out.println("super.km = " + super.km);
        System.out.println("super.model = " + super.model);
    }

    public Audi(String model, int year){
        super();
        System.out.println("Model&Year");
    }
    public String model = "Civic";
    public int km = 10000;


}
