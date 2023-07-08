package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        printProductOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        getMaxVal1(nums);
        System.out.println();
        getMaxVal2(nums);
        System.out.println();
        getMaxVal3(nums);
        System.out.println();
        getMaxVal4(nums);
        System.out.println();
        getMin1(nums);
        System.out.println();
        getMin2(nums);
        System.out.println();
        getMin3(nums);
        System.out.println();
        getMin4(nums);
        System.out.println();
        getMin5(nums);
        System.out.println();
        getMinEvenGreaterThen7(nums);


    }

    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Structured == Yapisal)
    public static void printElements1(List<Integer> sayilar) {
        for (Integer w : sayilar) {
            System.out.print(w + " ");

        }
    }

    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));

    }

    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }
    }

    public static void printEvenElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));

    }

    public static void printSquareOfOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.println(t + " "));

    }

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.println(t + " "));


    }

    public static void printSumOfSquareOfDistinctEvenElements(List<Integer> nums) {
        Integer sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums) {
        Integer product = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.println(product);

    }

    public static void getMaxVal1(List<Integer> nums) {
        Integer max =
                nums.stream().
                        distinct().
                        reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    public static void getMaxVal2(List<Integer> nums) {
        Integer max =
                nums.stream().
                        distinct().
                        reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    public static void getMaxVal3(List<Integer> nums) {

        int max = nums.
                stream().
                distinct().
                sorted().
                reduce((t,u)->u).get(); //reduce()'u identity olmadan kullandik o yüzden get() kullanmak zorundaa kaldik
        System.out.println(max);

    }
    public static void getMaxVal4(List<Integer> nums) {

        int max = nums.
                stream().
                distinct().
                sorted().
                reduce(Math::max).get(); //reduce()'u identity olmadan kullandik o yüzden get() kullanmak zorundaa kaldik
        System.out.println(max);

    }
    public static void getMin1(List<Integer> nums){
        Integer min =
                nums.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
        System.out.println(min);
    }
    public static void getMin2(List<Integer> nums){
        int min =
                nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }
    public static void getMin3(List<Integer> nums){
        int min =
                nums.stream().distinct().sorted().reduce((t,u)->t<u?t:u).get();
        System.out.println(min);
    }
    public static void getMin4(List<Integer> nums){
        Integer min =
                nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u)->u).get();
        System.out.println(min);
    }
    public static void getMin5(List<Integer> nums){
        Integer min =
                nums.stream().distinct().reduce((t, u)->Math.min(u,t)).get();
        System.out.println(min);
    }
    public static void getMinEvenGreaterThen7(List<Integer> nums){
        Integer min =
                nums.
                        stream().
                        filter(t-> t>7 && t%2==0).
                        sorted().
                        reduce((t,u)->t).get();
        System.out.println(min);
    }

}