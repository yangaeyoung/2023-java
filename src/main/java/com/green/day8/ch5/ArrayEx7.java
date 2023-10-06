package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        //1. 정수 10개를 저장할 수 있는 배열을 만듦
        //   0번부터 9값을 순차적으로 대입한다.

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int rIdx = (int) (Math.random() * arr.length); //0~9
            int tmp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = tmp;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int rIdx = (int) (Math.random() * arr.length);
            if (i == rIdx) {
                continue;
            }
            int tmp = arr[i];//0~9까지 임의의 공간에 넣어 두기(0번째 자리가 빔)
            arr[i] = arr[rIdx];//랜덤의 값을 0번째 자리에 넣기
            arr[rIdx] = tmp;//빈칸에 있던 0을 랜덤자리에 채우기
        }
        System.out.println(Arrays.toString(arr));
    }
}