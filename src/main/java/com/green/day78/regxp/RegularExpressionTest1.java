package com.green.day78.regxp;

import java.util.regex.Pattern;

public class RegularExpressionTest1 {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "12345";
        String str3 = "12A345";
        String regexp = "^[\\d]*$";

        System.out.printf("%s > %b\n", str1,Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2,Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3,Pattern.matches(regexp, str3));
    }
}
