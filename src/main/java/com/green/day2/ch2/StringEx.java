package com.green.day2.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        System.out.println(name);

        System.out.println("Ja" + "va");

        System.out.println("12" + 10 + 9);
        //"12" + 10 //"12"스트링 리터럴 > 10 정수
        //"12" + 10
        //"12" + "10" >1210
        //"1210" + 9
        //"1210" + "9" > "12109"

        System.out.println("12" + (10 + 9));
        //10 + 9 > 19 어느 것을 먼저 합하느냐가 중요
        //"12" + 19
        //"12" + "19" > "1219"
    }
}
