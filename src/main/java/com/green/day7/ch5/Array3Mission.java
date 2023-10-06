package com.green.day7.ch5;

import java.util.Arrays;

public class Array3Mission {
    public static void main(String[] args) {

//        int[] arr1 = { 5, 10, 15}; // 0 1 2
//        int[] arr2 = new int[4]; // 0 1 2 3
//        //            2<3
//        for(int i=0; i< arr1.length; i++){  // 0 1 2
//            arr2[i] = arr1[i]; // arr2[3] = arr1[3] // 복사하는 단계
//        }
//
//        for(int i=0; i<arr2.length; i++){
//            System.out.println("arr1: " + arr2[i]);
//        }
//        System.out.println("---------");
//
//        arr2[3] = 20;
//        for(int i=0; i<arr2.length; i++){
//            System.out.println("arr2: " + arr2[i]);
//        }
//
//        System.out.println("---------");

        //arr2는 길이가 4, arr1과 같은 방은 같은 값을 가지고 있고
        //3번 방은 20을 갖고 있는 배열을 만들어 주세요.

        int[] arr1 = {5, 10, 15, 16};
        int[] arr2 = new int[arr1.length + 1];
        arr2[arr2.length-1] = 100;

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
                System.out.println("arr2: " + arr1[i]);
        }
            for (int i = 0; i < arr2.length; i++) {
                System.out.println("arr2: " + arr2[i]);
            }
        }
    }

