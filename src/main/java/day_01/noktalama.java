package day_01;

public class noktalama {
    public static void main(String[] args) {
        //Bir String'de bulunan nok is say bul

        String str = "Vayy bee! dedi ve arkasini döndü, güldü...";
        int s = str.length();
        int a= str.replaceAll("\\p{Punct}","").length();

        System.out.println("Noktalama isareti sayisi : "+(s-a));
    }
}
