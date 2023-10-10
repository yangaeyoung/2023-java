package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int n) {
        System.out.println(n == 0 ? "0입니다." : "0이 아닙니다.");
    }


    void checkZero1(int n) {
        if (n == 0) {
            System.out.println("0입니다.");
            return;// 리턴으로 인해서 호출로 바로 감
        }
        System.out.println("0이 아닙니다.");
    }

    int randomValFromTo(int n, int n1) {
        return (int) (Math.random() * (n1 - n + 1)) + n;
    }

//    void scoreResultPrint(int score) {
//        if (score < 0 || score > 100) {
//            System.out.println("잘못된 점수");
//            return;
//        }
//        String grade = "D";
//        if (score >= 90) {
//            grade = "A";
//        } else if (score >= 80) {
//            grade = "B";
//        } else if (score >= 70) {
//            grade = "C";
//        }
//        System.out.printf("%s학점\n", grade);
//    }

    void scoreResultPrint(int n){
        if( n < 0 || n > 100){
            System.out.println("잘못된 점수");
            return;
        }
        String grade = "D";
        if ( n >= 90){
            grade = "A";
        } else if( n >= 80){
            grade = "B";
        } else if (n >= 70){
            grade = "C";
        }
        System.out.printf("%s학점\n", grade);
    }
}