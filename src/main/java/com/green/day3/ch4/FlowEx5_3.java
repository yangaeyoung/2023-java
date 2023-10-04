package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5_3 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        String grade = "C";
        String opt = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }

        if (score >= 80) {
            int rMod = score % 10; //나머지 6이 rMod에 들어감 // 나머지값을 구하고 싶으면 mod % 10(일의자리 수 구하기)
            if (rMod >= 8 || score == 100) {
                opt = "+";
            } else if (rMod <= 3) {
                opt = "-";
            }
        }

        System.out.printf("%s%s 학점\n", grade, opt);
    }
}