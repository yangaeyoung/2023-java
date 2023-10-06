package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("원하는 메뉴를 선택하세요. (종료: 0) >>");
            Scanner scan = new Scanner(System.in);
            System.out.println("(1) square");
            System.out.println("(2) tri");
            System.out.println("(3) log");
            int choice = scan.nextInt();

            if (choice == 0) {
                break;//while문 빠져나옴
            } else if (choice < 1 || choice > 3) {// !(choice == 1 || choice == 2 || choice == 3 )
                System.out.println("메뉴를 잘못 선택하셨습니다.");
                continue;
            }
            System.out.printf("선택하신 메뉴는 %d번입니다.\n", choice);//continue로 인해서 출력 안됨 while로 올라감
        }
        System.out.println("프로그램을 종료합니다");//break문으로 빠져나와 이  줄 출력
    }
}