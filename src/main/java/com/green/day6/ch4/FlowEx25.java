package com.green.day6.ch4;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요.(예:12345) >> ");
        num = scan.nextInt();

        while(num != 0){
            int modVal = num % 10;
            num = num / 10; //num /= 10;
            sum += modVal;
        }

        System.out.println("결과 >> " + sum);

        //12345 >> 15 결과값
        //2233 >> 10


    }
}
