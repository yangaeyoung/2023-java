package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10);
        me.checkZero(9);
        me.checkZero(0);

        int r = me.randomValFromTo(10, 100);
        System.out.println("r : " + r);
        int r2 = me.randomValFromTo(5, 9);
        System.out.println("r2 : " + r2);

        me.scoreResultPrint(101);//잘못된 점수
        me.scoreResultPrint(100);//A학점
        me.scoreResultPrint(90);//A학점
        me.scoreResultPrint(89);//B학점
        me.scoreResultPrint(88);//B학점
        me.scoreResultPrint(79);//C학점
        me.scoreResultPrint(69);//D학점
        me.scoreResultPrint(-1);//잘못된 점수
    }
}
