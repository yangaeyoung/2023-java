package com.green.day78.regxp;

import java.util.regex.Pattern;

public class RegularExpressionTest2 {
    public static void main(String[] args) {
        String str1 = "asdfAdf";
        String str2 = "adfa00";
        String str3 = "ABCD12";
        String regexp = "^[a-z|A-Z]*$";

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2,Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3,Pattern.matches(regexp, str3));
    }
}
