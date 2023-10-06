package com.green.day7.ch4;

public class BreakContinue {
    public static void main(String[] args) {
        //break를 사용할 수 있는 곳: switch, 반복문

        //continue를 사용할 수 있는 곳: 반복문

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;//가장 가까운 반복문 박살
            }
        }
        System.out.println("-------------");


        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){ continue; } //skip
            System.out.println(i);
        }
    }
}
