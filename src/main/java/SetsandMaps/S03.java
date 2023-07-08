package SetsandMaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S03 {
    public static void main(String[] args) {
        //Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        //Örnek: "Mississippi" => "Misp"

        String s = "Mississippi";
        String [] arr = s.split("");//harflerine ayirinca zaten Array'e dönüstü
        List<String> myList = Arrays.asList(arr);

        Set<String> mySet = new HashSet<>(myList);
        System.out.println(mySet);
    }
}
