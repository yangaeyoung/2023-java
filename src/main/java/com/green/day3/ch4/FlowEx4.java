package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        char grade = 'D'; // 변수를 주어서 else 를 따로 하지 않음

        if( score >= 90) {
            grade = 'A';
        } else if ( score >= 80) {
            grade = 'B';
        }else if ( score >= 70){
            grade = 'C';
        }
        System.out.printf("%c학점\n", grade);
        System.out.println("끝");



        //score값이 90점보다 같거나 크면 A학점이 출력
        //score값이 80점보다 같거나 크면 B학점이 출력
        //score값이 70점보다 같거나 크면 C학점이 출력
        //나머지는 D학점
    }
}
