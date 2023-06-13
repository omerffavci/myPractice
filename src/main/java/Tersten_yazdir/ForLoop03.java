package Tersten_yazdir;

public class ForLoop03 {
    public static void main(String[] args) {
        //864'ün rak top yazdiran for döngüsü...

        int a = 0;
        for (int i = 864; i > 0 ; i/=10) {
            a+=i%10;

        }
        System.out.println(a);
    }
}
