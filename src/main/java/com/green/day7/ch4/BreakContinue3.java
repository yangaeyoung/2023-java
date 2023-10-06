package com.green.day7.ch4;

public class BreakContinue3 {
    public static void main(String[] args) {
        abc:
        for (int i = 0; i < 5; i++) {

            for (int z = 10; z < 15; z++) {
                if (z == 13) { break abc;}//가까운 반복문 박살이 아니라 밖의 abc의 반복문을 박살시키는 법
                System.out.printf("i:%d - z:%d\n", i, z);

            }
        }
        System.out.println("----------");

        def:
        for (int i = 0; i < 5; i++) {
            for (int z = 10; z < 15; z++) {
                if (z == 13) { continue def;}
                System.out.printf("i:%d - z:%d\n", i, z);

            }
        }
    }
}