package com.green.day8.ch5;

import javax.crypto.spec.PSource;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        //score안에서 min값과 max값을 찾아서 출력해
        int min = score[0];//첫번째 값을 넣는 것이 문제가 없음
        int max = score[0];
        for (int i = 1; i < score.length; i++) {//int에 0번방을 넣었기 때문에 i값을 1로 잡음
            if (max < score[i]) {max = score[i];} //처음 잡힌 값보다 더 큰 수를 만나면 max값을 바꿔치기
            if (min > score[i]) {min = score[i];}
        }
        System.out.println("최대값: " + max); //printf("max: %d, min: %d\n", max, min);
        System.out.println("최소값: " + min);
    }
}
