package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args) {
        //50~200 사이의 랜덤값
        //100이하면 그 값의 *2한 결과값 출력
        //100초과면 그 값의 +10한 결과값 출력

        int val = (int) (Math.random() * 151) + 50;
        System.out.println("val: " + val);

        if (val <= 100) {
            System.out.println(val * 2);
        } else {
            System.out.println(val + 10);
        }

        System.out.printf("%d", val > 100 ? val + 10 : val * 2);
    }
}
