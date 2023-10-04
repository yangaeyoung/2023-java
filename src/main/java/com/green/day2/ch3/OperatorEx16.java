package com.green.day2.ch3;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        //= float pi = (float)3.1; 두가지 방법으로 더블형 변경
        System.out.println(pi);

        int pro1 = (int)(pi * 1000); // 실수 592 날리고 정수형으로 변경
        System.out.println("pro1 : " + pro1);

        float pro2 = pro1 / 1000f;
        System.out.println("pro2 : " + pro2);

       System.out.println("one : " + (int)(pi * 1000) * 0.001f);
    }
}
