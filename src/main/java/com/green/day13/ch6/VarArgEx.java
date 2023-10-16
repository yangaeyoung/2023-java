package com.green.day13.ch6;

public class VarArgEx {

    public static void sum (int... n) {//배열의 원리
        int sum =0;
        for(int i=0; i<n.length; i++){
            sum += n[i];
        }
        System.out.printf("sum : %d\n", sum);
    }



    public static void main(String[] args) {
        sum(10, 20); //sum = 30
        sum(10, 20, 30); //sum = 60
        sum(10, 20, 30, 40); // sum = 100
        sum(10, 20, 30, 40, 50);
    }
}
