package SSG_TypeCasting;

public class C06_typeCasting {
    public static void main(String[] args) {
        String str="55";
        int sayi=Integer.valueOf(str);
        //bu deger kesinlikle sadece sayisal degerler olmak zorunda yoksa hata aliriz
        System.out.println(sayi+10);//toplama islemi yaptigi icin sayi degeri oldugunu anladim

        int sayi1=55;
        String str1=String.valueOf(sayi1);
        //burda bir sorun karsilasmam neredeyse imkansiz ama tersi durumunda cok dikkatli olmaliyim
        System.out.println(str1+10);//concat yaptigi icin string bir deger oldugunu anlamis oldum

        String tv = "$1100";
        tv=tv.replace('$','0');
        String radio = "$300";
        radio=radio.replace('$','0');
        System.out.println(tv+radio);//$1100$300
        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println("$"+totalPrice);





    }
}