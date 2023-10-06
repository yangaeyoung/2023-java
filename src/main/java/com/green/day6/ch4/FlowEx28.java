package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("answer : " + answer);

        //while문은 일단 확인하고 실행, 원하는 값이 나올 때까지 반복하고 싶은데 "언제" 멈춰야 할 때
        //do while문은 일단 실행함

        while (true) { //무한루프
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            input = scan.nextInt();
            if (answer > input) {
                System.out.println("UP");
            } else if (answer < input) {
                System.out.println("Down");
            } else {
                System.out.println("끝!!");
                break;
            }
        }

        /*
        1~100 사이의 정수를 입력하세요 >>
        입력한 숫자보다 정답이 크다 > UP
        입력한 숫자보다 정답이 작다 > Down
        맞힐 때까지 반복함
         */
        //깃허브: 로컬에 저장

    }
}
