package com.green.day8.ch5;

public class ArrayToStringMission2 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3};
        //System.out.println(Arrays.toString(arr));
        //for문을 활용하여 콘솔에 [5, 10, 7, 3] 출력되도록 하셈.
        int commaLen = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < commaLen)
                System.out.print(", ");
        }
        System.out.println("]");



        System.out.println("------1-----");


        System.out.print("[");
        for(int i=0; i< arr.length; i++){
            if (i != 0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");


        System.out.println("------2-----");
        System.out.printf("[%d", arr[0]);//0번 방에는 체크 하지 않는 것으로
        for(int i=1; i< arr.length; i++){
            System.out.printf(", %d",arr[i]);
        }
        System.out.println("]");
    }
}
