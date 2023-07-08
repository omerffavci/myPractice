package Constructor;

public class Human {
    String eyes = "brown";
    String hair = "dark";
    double height;
    double weight = 75;
    boolean girl = false;

    public Human(String eyes, String hair, double height, double weight, boolean girl) {
        this.eyes = eyes;
        this.hair = hair;
        this.height = height;
        this.weight = weight;
        this.girl = girl;
    }

    void eat(){
        System.out.println(this.height+" is eating");
    }


    @Override
    public String toString() {
        return "Human{" +
                "eyes='" + eyes + '\'' +
                ", hair='" + hair + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", girl=" + girl +
                '}';
    }
}
