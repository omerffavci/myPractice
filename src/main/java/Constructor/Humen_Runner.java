package Constructor;

public class Humen_Runner {
    public static void main(String[] args) {
        Human insan1 = new Human("blue","blonde",1.75, 57,false);
        Human insan2 = new Human("green","blonde",1.70, 97,true);
        Human insan3 = new Human("brown","brown",1.65, 70,true);

        System.out.println(insan1);
        System.out.println(insan2);
        System.out.println(insan3);
        System.out.println(insan3.height);

        insan2.eat();
    }
}
