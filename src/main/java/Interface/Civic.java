package Interface;

public class Civic implements Security, Engine, Ac{
    @Override
    public void run() {
        System.out.println("Civic is safe");
    }

    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void airCon() {
        System.out.println("Cools PErfect-Civic");
    }
}
