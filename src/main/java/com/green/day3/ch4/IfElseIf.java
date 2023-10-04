package com.green.day3.ch4;

public class IfElseIf {
    public static void main(String[] args) {
        if (2 == 1) {
            System.out.println("1");
        } else if (3 == 2) {
            System.out.println("2");
        } else if (4 == 3) {
            System.out.println("3");//123 모두 거짓이기 때문에 콘솔에 출력되지 않고 else만 뜨는데 3 여기서 진실이면 3과 끝이 뜸
        } else {
            System.out.println("else");
        }

        System.out.println("끝");
    }
}