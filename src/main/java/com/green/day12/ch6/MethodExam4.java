package com.green.day12.ch6;

import com.green.day10.ch6.MethodExam;

import java.util.Arrays;

public class MethodExam4 {
    int[] plusMap(int[] arr, int n) {

        int[] rArr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rArr1[i] = arr[i] + n;
        }
        return rArr1;
    }
//    int[] plusOrigin(int[] arr, int n) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] += n;
//        }
//        return arr;
//    }
    void plusOrigin(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
    }
    int[] randomValFromTo (int len, int min, int max){
        int[] tmpArr = new int[len];
        MethodExam me = new MethodExam();
        for(int i=0; i<tmpArr.length; i++){
            tmpArr[i] = me.randomValFromTo(min,max);
        } return tmpArr;
    }

    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = {10, 20, 30};
        int[] rArr1 = me4.plusMap(arr, 2);//arr 값에 +2 {12, 22, 32}
        System.out.println(Arrays.toString(arr));//[10, 20, 30]
        System.out.println(Arrays.toString(rArr1));//[12, 22, 32]

        me4.plusOrigin(arr,4); //+4
        System.out.println(Arrays.toString(arr));//[14, 24, 34]

        int[] rArr2 = me4.randomValFromTo(10,5, 20);//(배열크기, min, max)
        System.out.println(Arrays.toString(rArr2));

    }
}
