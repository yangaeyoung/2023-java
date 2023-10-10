package com.green.day9.ch5;

public class ArrayEx18 {
    public static void main(String[] args) { //쌤 것 참고하기
        int[][] score = {// int[][] : int 배열
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
        };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {//4개의 length
            for (int z = 0; z < score[i].length; z++) { //score[i] 중괄호 안의 자릿수 3
                System.out.printf("score[%d][%d] = %d\n", i, z, score[i][z]);
//            sum += score[i][z];
            }
        }
        //향상된 for문을 이용하여 sum값 구하기
        for (int[] arr : score) {//score = int(~~; i++)의 값이 arr로 들어가고
            for(int val : arr){//arr의 값이 101, ,102 순차적으로 val로 들어감
           sum += val;
            }
        }
            System.out.println("sum : " + sum);
    }
}

/*
score[0][0] = 101
score[0][1] = 102
score[0][2] = 103
...
score[3][2] = 43
sum = ??
 */