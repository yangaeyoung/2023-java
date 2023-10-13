package com.green.day12.ch6;


import java.util.Arrays;

public class MethodExam3 {

    int sumText(String str) {
//        int num = Integer.parseInt("123123");
//        int sum = 0;
//        for (int i = 0; i < str.length(); i++) {
//            int tmp = num % 10;//나머지 끝자리 수 분리
//            num /= 10; //몫
//            sum += tmp;
//        }
//        return sum;
//        배열
        char[] charArr = str.toCharArray();// char[] 호출
        int sum = 0;
        for(char ch : charArr){ //1부터 3까지 순차적으로 들어가면서 sum에 들어감
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }


    public static void main(String[] args) {
        MethodExam3 me3 = new MethodExam3();
        int sum = me3.sumText("123123");
        System.out.println(sum);
    }
}
