package com.green.day8.ch5;

import javax.crypto.spec.PSource;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        //score안에서 min값과 max값을 찾아서 출력해
        int min = score[0];//첫번째 값을 넣는 것이 문제가 없음
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {max = score[i];}
            if (min > score[i]) {min = score[i];}
        }
        System.out.println("최대값: " + max); //printf("max: %d, min: %d\n", max, min);
        System.out.println("최소값: " + min);
    }
}
