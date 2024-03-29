package practice;

import java.util.Arrays;

public class ArrayEx9Pt {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];
        /*
        arr각 방에 code에 있는 값만 랜덤하게 넣기
         */

        for (int i = 0; i < arr.length; i++) {
            arr[i] = code[(int) (Math.random() * code.length)];
        }
        System.out.println(Arrays.toString(arr));
    }
}
