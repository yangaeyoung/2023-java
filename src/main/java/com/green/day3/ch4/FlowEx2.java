package com.green.day3.ch4;

/*
    Scanner
    if
    parsing
 */

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args){
        //(콘솔) 숫자를 하나 입력하세요 >
        //(입력 기다려야 함)
        //숫자를 입력하고 엔터를 누르면
        //String 변수에 해당 값이 저장될 수 있도록
        //해당 문자열을 > 정수형으로 형변환
        //해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다."
        //해당 숫자가 0이 아니라면 콘솔에 "입력하신 숫자는 0이 아닙니다."
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요. > ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        int x = num;
        if (x == 0) {System.out.println("입력하신 숫자는 0입니다.");} //if(num == 0) 이렇게 하면 int x = num; 없어도 됨
        if (x != 0) {System.out.println("입력하신 숫자는 0이 아닙니다.");}

    }
}
