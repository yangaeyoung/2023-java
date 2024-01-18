package com.green.day78.regxp;

import java.util.regex.Pattern;

public class RegularExpressionTest4 {
    public static void main(String[] args) {
        String str1 = "abc@naver.com";
        String str2 = "abc@naver.co.kr";
        String str3 = "히히111";
        String str4 = "1111";
        String str5 = "1하하1하하ㅠ12 12";
        String regexp = "^[a-zA-Z0-9_-]+@([a-zA-Z0-9]{3,}\\.[a-z]{2,}|[a-zA-Z0-9]{3,}\\.[a-z]{2,}\\.[a-z]{2,})$";

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2,Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3,Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4,Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str5,Pattern.matches(regexp, str5));
    }
}
