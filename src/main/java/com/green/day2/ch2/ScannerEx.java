package com.green.day2.ch2;

import java.net.SocketOption;
import java.util.Scanner;

public class ScannerEx {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in); //scan=객체에 주소 값이 저장됨
        System.out.print("두자리 정수를 하나 입력해 주세요 >> ");
        String input = scan.nextLine(); // 내가 입력한 숫자의 값(23)이 scan.nextLine()
        int num = Integer.parseInt(input); //문자열 "23" > 정수 숫자 23으로 변환

        // >23입력
        System.out.println("입력내용: " + input + input); // 문자열  > 2323
        System.out.printf("num=%d\n",num + num); // 숫자   > 46
    }
}
