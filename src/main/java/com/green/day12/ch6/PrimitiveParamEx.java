package com.green.day12.ch6;

class Date{
    int x;
}


public class PrimitiveParamEx {
    public static void main(String[] args) {
        Date d = new Date();
        d.x = 10;
        System.out.printf("main() : x = %d\n", d.x);
        change(d.x);

    }

    public static void change(int x) {//10
        x = 1000; //10 = 1000;
        System.out.printf("change() : x =%d\n", x);

    }

    public static void change(Date d) {//10
        d.x = 1000;
        System.out.printf("change() : x =%d\n", d.x);
    }
}
