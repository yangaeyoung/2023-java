package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5); //*****
        sp.line(7); //*******
        System.out.println("-----------");

        for(int i=0; i<4; i++){
        sp.line(4);
        }
        System.out.println("-----------");
        sp.square(4);
        //****
        //****
        //****
        //****


        System.out.println("-----------");

        sp.triangle(5);
        //* line(1)
        //**
        //***
        //****
        //***** line(5)

        System.out.println("-----------");

        String gender = sp.chkGenderById("011231-2117111");
        System.out.println(gender);
        /*
        8번째 자리의 숫자가
        2,4 > 여성
        1, 2 > 남성
        이외의 값이면 > 유효하지 않는 주민번호
         */
        System.out.println("-----------");

        int sum = sp.sumFromTo(4,10);
        System.out.println("sum : " + sum);

        int sum2 = sp.sumFromTo(10,15);
        System.out.println("sum2 : " + sum2);

        System.out.println("-----------");

    }
}
