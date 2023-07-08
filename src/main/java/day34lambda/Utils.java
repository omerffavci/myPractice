package day34lambda;

public class Utils {
    public static void printInTheSameLineWithSpace(Object obj){
        System.out.println(obj+" ");
    }
    public static void printInTheSameLineWithDot(Object obj){
        System.out.print(obj+".");
    }
    public static void takeLastOne(String obj){
        System.out.print(obj.charAt(obj.length()-1));
    }
    public static boolean isNumberEven(int obj){
        return obj%2==0;
    }

}
