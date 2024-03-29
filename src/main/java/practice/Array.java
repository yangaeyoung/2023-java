package practice;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각 방의 1~5의 랜덤한 값을 넣어주세요.
        (중복 제거)
         */
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 5) + 1;
            System.out.println(arr[i]);

            for (int z = 0; z < i; z++) {
                if (arr[i] == arr[z]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
