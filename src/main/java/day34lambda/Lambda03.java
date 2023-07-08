package day34lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        RemoveIFLengthGreaterThan5(myList);
        System.out.println();
        RemoveIFBwZoEwF(myList);
        RemoveIFBwZoEwF2(myList);
        System.out.println(SumBetween7and70(10,9));
        System.out.println(CarpimArasinda());
        System.out.println(SumOfEvensBetweenOfTwoInt(90,7));
    }
    public static void RemoveIFLengthGreaterThan5 (List<String> myList){
        myList.removeIf(t->t.length()>5);
        System.out.println(myList);
    }
    public static void RemoveIFBwZoEwF (List<String> myList){
        myList.removeIf(t->t.charAt(0)=='Z'||t.charAt(t.length()-1)=='f');
        System.out.println(myList);
    }
    public static void RemoveIFBwZoEwF2 (List<String> myList){
        myList.removeIf(t->t.startsWith("Z")||t.endsWith("f"));
        System.out.println(myList);
    }
    public static int SumBetween7and70(int a, int b){
        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }
       return IntStream.
               rangeClosed(a,b).
               reduce(Math::addExact).
               getAsInt();
    }
    public static int CarpimArasinda(){
        return IntStream.
                range(3,10).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    public static int SumOfEvensBetweenOfTwoInt(int a, int b){
        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.
                range(a+1,b).filter(Utils::isNumberEven).
                sum();
    }
}
