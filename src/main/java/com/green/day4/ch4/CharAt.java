package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk".toUpperCase();
        System.out.println(str);

        char result = str.charAt(1); //정수값 charAt(0) = A 0부터 자리 시작
        System.out.println("result1 : " + result);
        System.out.println("result2 : " + str.charAt(2));
    }
}