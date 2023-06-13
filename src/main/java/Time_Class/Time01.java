package Time_Class;

import java.time.LocalTime;

public class Time01 {
    public static void main(String[] args) {
        /*Eğer saat
                i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
                ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
                iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
                iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.*/
        LocalTime zaman = LocalTime.now();
        int hour = zaman.getHour();
        System.out.println("time = " + hour);

        if (0 < hour && hour < 5){
            System.out.println("Uyku zamanı");
        } else if (8<hour && hour<16) {
            System.out.println("Calisma zamani");
        } else if (19<hour && hour<22) {
            System.out.println("Aile zamani");
        } else {
            System.out.println("kisisel zaman");
        }

    }
}
