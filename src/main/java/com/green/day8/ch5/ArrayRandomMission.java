package com.green.day8.ch5;

import com.green.day7.ch5.Array;

import java.util.Arrays;

public class ArrayRandomMission {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각 방의 1~5의 랜덤한 값을 넣어주세요.
        (중복 제거)
         */

        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) (Math.random() * 5) + 1;

            for (int z=0; z<i; z++) {
                if (arr[i] == arr[z]) {//[] 자리값, break걸리면 맨 위 for문의 i++로 가서 이전 자리값부터 다시 재설정
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
