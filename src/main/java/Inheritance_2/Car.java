package Inheritance_2;

public class Car extends Vehicle {
    public Car (){
        this(44);
        System.out.println("Car 1");
    }
    public Car (int sayi){
        super(12.5);
        System.out.println("sayi");
    }
    public String model = "Accord";
    public int km = 20000;

}
