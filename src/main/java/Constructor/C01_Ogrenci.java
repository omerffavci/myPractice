package Constructor;

public class C01_Ogrenci {
    public String isim = "Ömer Faruk";
    public int yas = 26;
    public double not = 75.55;

    C01_Ogrenci(String isim, int yas, double not) {
        this.isim = isim;
        this.yas = yas;
        this.not = not;

    }

    C01_Ogrenci(String isim, double not) {
        this.isim = isim;
        this.not = not;

    }
}