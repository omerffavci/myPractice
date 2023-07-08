package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_soru12 {
    public static void main(String[] args) {
        /*Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod yazınız.
        Not:
        Mountain Array ==> [0, 2, 5, 3, 1]
        Bir array elemanları en büyük değerine kadar sürekli artan,
        en büyük değerinden sonra sü- rekli azalan değer alıyorsa Mauntain Array' dir. */

        int a[] = { 0, 2, 5, 3, 1 };
        List<Integer> list = new ArrayList<>();
        Arrays.stream(a).forEach(t-> list.add(t));
        System.out.println("list.toString() = " + list.toString());

        int[] numbers = { 1, 2, 3, 4, 5 };

        int sum = Arrays.stream(numbers).sum();

        System.out.println("Toplam: " + sum);

    }
}
