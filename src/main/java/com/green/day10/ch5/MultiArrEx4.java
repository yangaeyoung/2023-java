package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                , {"computer", "컴퓨터"}
                , {"integer", "정수"}
                , {"double", "실수"}
        };
        /*
        Q1. chair의 뜻은? >> dmlwk
            틀렸습니다. 정답은 의자입니다.

        Q2. computer의 뜻은? >> zjavbxj
           틀렸습니다. 정답은 컴퓨터입니다.

        Q3. inter의 뜻은? >> 정주
           틀렸습니다. 정답은 정수입니다.
         */
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            //String[] wordArr = words[i];
            System.out.printf("Q%d. %s의 뜻은? > ", i + 1, words[i][0]);//wordArr[0]
            String an = scan.nextLine();
            if (an.equals(words[i][1])) {//wordArr[1]
                System.out.println("정답입니다.");
            } else {
                System.out.printf("틀렸습니다. %s입니다.\n", words[i][1]);
            }
        }
        System.out.println("끝");

    }
}

