package com.green.day2.ch2;

public class CastingEx1 { //casting, 형변환
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d; //강제 형변환
        System.out.println("score : " + score );
        System.out.println("d : " + d );

        byte b1 = 127;
        short s1 = b1;
        int i1 = s1; // int가 제일 짱

        float f1 = i1; //정확한 값은 아님
        int i2 = (int)f1;
    }
}
