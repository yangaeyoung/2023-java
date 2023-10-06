package com.green.day7.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        //369게임
        /*
        i=1
        i=2
        i=3 "짝"
        i=4
        i=5
        i=6 "짝"
        i=30 짝
        i=33 짝짝
         */

        for (int i = 1; i <= 100; i++) {
            System.out.printf("i=%d\n", i);
            int temp = i;
            while (temp > 0) {
                int modVal = temp % 10;
                if (modVal != 0 && modVal % 3 == 0) {
                    System.out.print("짝");
                }
                temp /= 10;
            }
            System.out.println();
        }
    }
}


class FlowEx29_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i=%d\n", i);
            int temp = i;
            do {
                int modVal = temp % 10;
                if (modVal != 0 && modVal % 3 == 0) {
                    System.out.print("짝");
                }
                temp /= 10;
            } while (temp != 0);
            System.out.println();
        }
    }
}

