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

        int[] arr1 = new int[5];

        for(int i=0; i<arr1.length; i++) {
            int random = (int) (Math.random() * 10) + 1;
            arr1[i] = random;
        }

        for(int z=0; z<arr1.length; z++) {
            System.out.println(arr1[z]);
        }

        System.out.println(arr1);
        System.out.println(arr1.toString());
        System.out.println(Arrays.toString(arr1));


    }
}
