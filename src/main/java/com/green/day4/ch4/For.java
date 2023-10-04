package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
        //첫번째: 초기화 공간
        //두번째: 반복여부 체크
        //세번째: 증감식
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕");

            int j = 0;
            for(; j<10; ){
                System.out.println("j : " + (++j)); //++j 1씩 증가
            }
        }
    }
}
