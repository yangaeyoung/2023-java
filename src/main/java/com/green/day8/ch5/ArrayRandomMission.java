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
            System.out.println(arr[i]);//랜덤으로 나오는 과정 보기

            for (int z=0; z<i; z++) {
                if (arr[i] == arr[z]) {
                    i--;
                    //[] 자리값, 중복이 발견되면 i--으로 맨 위 for문의 i++로 가서 이전 자리값부터 다시 재설정
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));//for문을 다 빠져나오기
    }
}
