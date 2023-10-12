package com.green.day10.ch6;

public class NumberBoxTest {//호출
    public static void main(String[] args) {
//        NumberBox nb1;//대문자로 시작-레퍼런스 변수 객체의 주소값만 담을 수 있다.
//        nb1 = new NumberBox();//변수 선언
        NumberBox nb1 = new NumberBox();//객체 생성

        nb1.sum(10,20); //10,20 입력하는 이름 = 아규먼트 void
        nb1.sum(30,40);

        nb1.minus(40,20);//40-20=20

        nb1.abs(-10);//양수가 출력되게
        nb1.abs(10);
        nb1.abs(-33);
        nb1.abs(39);
    }
}
