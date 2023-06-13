package Array;

import java.util.Arrays;

public class MultidArray {
    public static void main(String[] args) {

        int arr [][] = new int [2][3];
        System.out.println(Arrays.deepToString(arr));


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (j%2==0) {
                        arr[i][j] = 2*j+i+1;
                }else {
                        arr[i][j] = 2*j+i+1;
                }
            }

        }
        System.out.println(Arrays.deepToString(arr));




    }
}
