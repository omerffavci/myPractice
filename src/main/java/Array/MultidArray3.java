package Array;

public class MultidArray3 {
    public static void main(String[] args) {
        //Ornek: Bir integer multi dimensional arraydeki en kucuk ve en buyuk elemanlarin toplamini bulunuz
        int ages[][] = {{15, 4}, {2, 3} ,{12, 40, 21}}; // ==> 4 + 43 ==>47

        int min = ages [0][0];
        int max = ages [0][0];
        int b = 0;

        for (int w [] : ages) {
            for (int k : w) {
                min = Math.min(k, min);
                max = Math.max(k, max);

            }

        }
        System.out.println(max+min);
    }
}
