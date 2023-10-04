package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 주민번호를 입력하세요.(예: 011231-1111222) >> ");
        String humanId = scan.nextLine();
        //주민등록 입력 받으시고
        //주민번호를 확인하시고 >여자인지 남자인지, 유효하지 않은 주민등록번호인지 출력
        char result = humanId.charAt(7);

        switch(result){
            case '1', '3': // '' char 문자
                System.out.println("남자입니다.");
                break;
            case '2', '4':
                System.out.println("여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
                break;
        }
    }
}
