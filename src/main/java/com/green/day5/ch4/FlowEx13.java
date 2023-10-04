package com.green.day5.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        // 반복문을 사용하여 1~10을 전부 더한 값을 출력
        // 55출력
        int sum = 0;
        for( int i=1; i <= 10; i++){
            sum = sum + i;
            //sum += i; sum = sum + i;
        }
        System.out.println("sum : " + sum);


        }
    }
