package Interface;

public interface Engine {
    void eco();

    default void stop(){
        System.out.println("It stops perfect");
    }
    public static final int price = 3000;
}
