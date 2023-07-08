package Constructor;

public class C02_Urunler {
    String urAdi;
    boolean mevcut;
    int tarih;
    String firma;

    public C02_Urunler(String urAdi, boolean mevcut, int tarih, String firma) {
        this.urAdi = urAdi;
        this.mevcut = mevcut;
        this.tarih = tarih;
        this.firma = firma;
    }

    public C02_Urunler(String urAdi, boolean mevcut) {
        this.urAdi = urAdi;
        this.mevcut = mevcut;
    }

    @Override
    public String toString() {
        return "C02_Urunler{" +
                "urAdi='" + urAdi + '\'' +
                ", mevcut=" + mevcut +
                ", tarih=" + tarih +
                ", firma='" + firma + '\'' +
                '}';
    }
}
