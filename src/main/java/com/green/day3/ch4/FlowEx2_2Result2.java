package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2Result2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 > ");

        int val = scan.nextInt(); //좋은 방법은 아님
        if (val == 0) {
            System.out.println( "다른 값을 입력해 주세요.");
        } else {
            System.out.printf("%d은 %s수 입니다", val, val % 2 == 0 ? "짝" : "홀");} //3항식

    }
}
