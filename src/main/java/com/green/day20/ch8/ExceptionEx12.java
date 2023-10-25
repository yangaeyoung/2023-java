package com.green.day20.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
//        method1(); 주석 풀면 에러 터짐
        try {
            method2();
        } catch (Exception e) {
            System.out.println("method2 예외 발생!!");
        }
        System.out.println("끝");
    }
    static void method1() {
        int a = 10 / 0;
    }

    static void method2() throws Exception {
        int a = 10 / 0;
    }
}

class ExceptionEx12_2{
    public static void main(String[] args)  {
        try {
            method1();
        } catch (Exception e) {

        }
    }
    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {//throws Exception으로 했을 시 에러 발생할 때 책임 x Unhandled exception: 에러
        int a = 10 / 0;
    }
}