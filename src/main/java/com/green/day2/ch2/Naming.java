package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args){
        //1. 대소문자 구별. 길이제한 X
        int abc, aBc, abC, dkfpqkndvf;

        //2. 이름으로 예약어 사용 X
        //int int, void, static;

        //3. 숫자 시작 ㄴㄴ(처음만 아님 됨)
        //int 1ab; 이거 안됨
        int a1b, ab1;

        //---------------------------------------------------------
        //상수는 전부 대문자 구분은 언더바

        // PI, MAX_NUMBER
        final int PI = 0, MAX_NUMBER = 10;

        //4. 특수 문자 _, $만 가능
        int _ab, $ab;

        //케이스 기법
        //hello my name is hong

        // 1. 파스칼 케이스 기법 (클래스명) > 대문자로 시작
        // HelloMyNaveIsHong

        // 2. 카멜 케이스 기법 (변수명, 메소드명) > 소문자로 시작
        // helloMyNameIsHong

        // 3. 케밥 케이스 기법
        //  hello-my-name-is-hong

        // 4.스네이크 케이스 기법
        // hello_my_name_is_hong


        Date today = new Date(); //대문자로 시작 레퍼런스 타입
    }
}
