package StaticBlocks;

public class StaticBlock01 {
    static boolean cevap;
    static int sayi;

    static {
        cevap = true;
        System.out.print(sayi);
        System.out.println(cevap);
    }

    public static void main(String[] args) {
        System.out.println(sayi+" "+cevap);
    }
}
