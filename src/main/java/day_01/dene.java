package day_01;

public class dene {
    public static void main(String[] args) {
        String s = "   Miami 12345!!!!  ";
        int a = s.replaceAll("[^0-9A-Za-z]","").length();
        System.out.println(a);

        String m = "Marie Pele";
        String m2 = m.substring(0,m.length()-1).toUpperCase();
        System.out.println("m2 = " + m2);

        int aaa  = 'A';
        System.out.println(aaa);

        System.out.println('a'<65);

        float f = 12.4F;
        byte bay = (byte) 176;
        System.out.println(bay);


        int x = 5;
        int y = 2;
        double d = x/y;
        System.out.println(d);

        int num1 = 4;
        int num2 = 5;
        String str1 = "Ali";
        System.out.println(num1+num2+str1);
        System.out.println(str1+num1+num2);



    }
}
