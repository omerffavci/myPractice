package SSG_TypeCasting;

public class C04_typeCasting {
    //bir int deger ve bir double degeri toplayin
    //ayni sayilari toplayip sadece tam kismini alin
    public static void main(String[] args) {
        int sayi1=65;
        double sayi2=12.5;
        System.out.println((sayi1+sayi2));//77.5//autowidening yapar
        System.out.println((int)(sayi1+sayi2));//77//burda bir veri kaybi soz konusu tam bu noktada
        // java ben sorumluluk kabul etmem diyor yani sorumluluk kullaniciya ait.
        System.out.println(sayi2);




    }
}
