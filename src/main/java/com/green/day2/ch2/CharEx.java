package com.green.day2.ch2;

public class CharEx {
    public static void main(String[] args){
        char ch = '4'; //char 정수타입    4는 문자임
        int val = 66;

        System.out.printf("%c: %d\n", ch, (int)ch);
        System.out.printf("%c: %d\n", (char)val, val);
    }
}
