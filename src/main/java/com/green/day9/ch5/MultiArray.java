package com.green.day9.ch5;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {
                {100, 200},//0번방
                {300, 400},//1번방
                {500, 600} //2번방

        };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

        System.out.println("------");
        int[] intArr = arr[2];
        System.out.println(intArr[1]);
        System.out.println("arr.length : " + arr.length);//3줄
        System.out.println("arr[0].length : " + arr[0].length);// {100, 200} = 2개



//        int[] intArr1 = arr[0];
//
//        int[] newIntArr = {1, 2, 3, 4};
//        arr[0] = newIntArr;
    }
}
