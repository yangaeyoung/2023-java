package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        //Scanner를 이용하여 정수를 입력 받고
        //"*을 출력할 라인의 수를 입력하세요 >> "


        /*

         만약 3을 입력
         *
         **
         ***

         만약 4를 입력
         *
         **
         ***
         ****

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        int line = scan.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");


        for (int i = 0; i < line; i++) {
            for (int z = 0; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


