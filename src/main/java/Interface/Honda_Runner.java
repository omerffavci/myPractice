package Interface;

public class Honda_Runner {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        c1.airCon();
        c1.eco();
        c1.run();
        c1.stop();

        System.out.println("===================");
        Accord a1 = new Accord();
        a1.airCon();
        a1.eco();
        a1.run();
        a1.stop();


        Security.door();
        System.out.println(Engine.price);
        System.out.println(Ac.price);
    }


}
