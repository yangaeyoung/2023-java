package com.green.day1;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int temp = x; //x값을 temp에 잠시 복사해 넣어두기
        x = y;
        y = temp;


        System.out.println("x : " + x);
        System.out.println("y : " + y);

    }
}
