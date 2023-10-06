package com.green.day6.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlowEx28_2 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println("answer : " + answer);
        Scanner scan = new Scanner(System.in);

        while (true) { //무한루프
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            input = scan.nextInt();
            if (input == answer) {break;}
            System.out.println( input < answer ? "Up" : "Down");
        }
        System.out.println("정답");
    }


        /*
        1~100 사이의 정수를 입력하세요 >>
        입력한 숫자보다 정답이 크다 > UP
        입력한 숫자보다 정답이 작다 > Down
        맞힐 때까지 반복함
         */
    //깃허브: 로컬에 저장

}
