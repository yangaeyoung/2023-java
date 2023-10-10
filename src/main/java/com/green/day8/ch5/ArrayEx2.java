package com.green.day8.ch5;

import com.green.day7.ch5.Array;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각 방의 1~10의 랜덤한 값을 넣어주세요.
        중복 허용
         */
        final int LEN= 5;
        int[] arr1 = new int[LEN];

        for(int i=0; i<arr1.length; i++) {//입력
            arr1[i] = (int) (Math.random() * 10) + 1;
            //실행할 때마다 랜덤한 값을 넣어야 하기 때문에 for문 안에 넣어야 함
//            arr1[i] = random; //현재 FOR문에서는 랜덤으로 0~4번까지의 자릿수를 입력
        }

        for(int i=0; i<arr1.length; i++) {//출력
            System.out.printf("arr[%d]: %d\n", i, arr1[i]);

        }

        System.out.println(arr1);//주소값을 찍을 수 없기 때문에 문자열로 출력됨
        System.out.println(arr1.toString());
        System.out.println(Arrays.toString(arr1));


    }
}
