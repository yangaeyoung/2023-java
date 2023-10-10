package com.green.day10.ch6;

public class ReturnNumberBox {

    int sum(int n1, int n2){
        return n1 + n2;//return이기 때문에 int이 됨
    }
    int abs(int n){//void로 쓰려면 rnb.abs(10); 이렇게 단독으로 있어야 함
        return n >0 ? n : -n;
    }
    int abs2(int n){// = 이 없기 때문에 계산이 안 됨
        if(n < 0){
            return -n; // n * -1
        }
        return n;
        }
    }

