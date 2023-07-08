package Interface;

public class Accord implements Security, Engine, Ac {
    @Override
    public void run() {
        System.out.println("Accord is safe");
    }

    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void airCon() {
        System.out.println("Cools Perfect-Accord");
    }
}
