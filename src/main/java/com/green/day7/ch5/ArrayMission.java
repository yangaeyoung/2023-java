package com.green.day7.ch5;

public class ArrayMission {
    public static void main(String[] args) {

        //for문과 arr을 이용하여 배열의 모든 방의 값을 출력하세요.
        /*

        100
        200
        300
        400
        500

         */

        int[] arr = {100,200,300,400,500};
        for(int i=0; i<arr.length; i++){// arr.length = 5 방이 다섯개
            System.out.println(arr[i]);
        }
    }
}
