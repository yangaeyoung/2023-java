package com.green.day10.ch6;

public class NumberBox {//정의
    void sum(int n1, int n2) {//n2에도 int 작성해줘야 함
        //파라미터 (매개변수) //int n; = 속성
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        return;// void에는 자동으로 리턴이 들어가 있는 것임
    }
    void minus(int n1, int n2){
            System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
            return;
        }
        void abs(int n){
            System.out.println( n > 0? n: -n);
            return;
        }
    }

