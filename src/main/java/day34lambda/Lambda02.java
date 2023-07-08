package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementsExceptStartsWithE(myList);
        System.out.println("================");
        printElementsHaveLessThanFiveChar(myList);
        System.out.println("================");
        List<String> newList = printElementsHaveMoreThanFiveChar(myList);
        System.out.println(newList);
        System.out.println("================");
        printElementsHaveLessThanFiveChar2(myList);
        System.out.println("================");
        List<String> denemeListesi = printLan(myList);
        System.out.println(denemeListesi);
        System.out.println("================");
        printUniqueElementsBiggerInAlphabeticOrder(myList);
        System.out.println("================");
        printUniqueElementsLowerInLengthOrder(myList);


    }
    public static void printElementsExceptStartsWithE(List<String> myList){
        myList.stream().
                filter(t->!t.startsWith("E")).
                forEach(t-> System.out.println(t+" "));
    }

    public static void printElementsHaveLessThanFiveChar(List<String> myList){
        myList.stream().
                distinct().
                filter(t->t.length()<5).
                forEach(t-> System.out.println(t+" "));
    }
    public static List<String> printElementsHaveMoreThanFiveChar(List<String> myList){
       return myList.stream().
               filter(t->t.length()>5).
               map(t->t.toUpperCase()).
               collect(Collectors.toList());

    }
    public static void printElementsHaveLessThanFiveChar2(List<String> myList){
        myList.stream().distinct().filter(z->z.length()<5).map(t->t.toLowerCase()).sorted().forEach(l-> System.out.println(l+" "));
    }
    public static List<String> printLan(List<String> myList){
        List<String> ganzNeu = myList.stream().filter(t->t.length()>=6).map(t->t.toLowerCase()).collect(Collectors.toList());
        return ganzNeu;
    }
    public static void printUniqueElementsBiggerInAlphabeticOrder(List<String> myList){
        myList.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(l-> System.out.println(l+" "));
    }
    public static void printUniqueElementsLowerInLengthOrder(List<String> myList){
        myList.stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(t->t.length())).
                forEach(Utils::takeLastOne);
    }

}
