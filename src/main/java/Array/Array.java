package Array;

public class Array {
    public static void main(String[] args) {
        //Ornek 2: String bir array olusturun, icine 7 tane eleman ekleyin,
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String ar [] = new String[7];
        ar[0] = "Busra";
        ar[1] = "Marie";
        ar[2] = "Pele";
        ar[3] = "Jolie";
        ar[4] = "Kerimcan";
        ar[5] = "Kemal";
        ar[6] = "Sogan";

        int sayi = 0;

        for (int i = 0; i < ar.length; i++) {
            sayi += ar[i].length();


        }
        System.out.println("sayi = " + sayi);

        System.out.println("------------------");

        //2.yol
        int a = 0;

        for (String p : ar) {
            a += p.length();

        }
        System.out.println("a = " + a);

    }
}
