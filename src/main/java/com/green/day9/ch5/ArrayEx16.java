package com.green.day9.ch5;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        /*
        3개의 String 값을 담을 수 있는 배열 생성
        3번 문자열로 입력을 받는다.(Scanner 이용)
        입력받은 문자열들을 순차적으로 배열에 값을 넣는다.
        값 넣는 게 종료가 되면 향상된 for문을 이용하여 저장되어 있는 값들을 콘솔에 출력하기
         */

        String[] s = new String[3];
        for (int i = 0; i < s.length; i++){
            Scanner scan = new Scanner(System.in);
            System.out.print("문자 3개를 입력하세요. > ");
            s[i] = scan.nextLine();
        }
        for (String str : s) {
            System.out.println(str);
        }
    }
}