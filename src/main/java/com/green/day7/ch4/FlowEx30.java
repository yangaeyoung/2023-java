package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        //반복문
        //

        int sum = 0;
        int i = 0;
        //i값이 계속 증가가되면 sum으로 더하기
        //sum 값이 100초과가 되는 시점의 i값
        abc:
        for (i=0; i<100; i++) {
            sum += i;
            while ( sum > 100) {break abc;}
            }
            System.out.println(i);
        }
    }
