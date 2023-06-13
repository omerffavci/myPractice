package Array;

import java.util.Arrays;

public class MultidArray2 {
    ////Ornek : Iki boyutlu bir array i tek boyutlu bir array e cevriniz.
    //        int numbers[][] = {{5, 4, 6}, {2, 3, 2}};//==> {5,4,2,3,2}

    public static void main(String[] args) {
        int numbers[][] = {{5, 4, 6}, {2, 3, 2}};
        int au = 0;
        for (int w []: numbers) {
            au += w.length;

        }
        System.out.println("au = " + au);
        int newarr [] = new int[au];
        int idx = 0;

        for (int w []: numbers) {
            for (int k : w){
                newarr[idx] = k;
                idx++;
            }

        }
        System.out.println(Arrays.toString(newarr));
    }
}
