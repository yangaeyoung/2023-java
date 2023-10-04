package com.green.day2.ch3;

import com.sun.jdi.PathSearchingVirtualMachine;

public class OperatorEx18 {
    public static void main(String[] args){
        float f1 = 15.1f, f2 = 15.6f, f3 = 15.9f;

        //ceil > 올림
        System.out.printf("ceil(%f): %f\n", f1, Math.ceil(f1));
        System.out.printf("ceil(%f): %f\n", f2, Math.ceil(f2));
        System.out.printf("ceil(%f): %f\n", f3, Math.ceil(f3));
        System.out.printf("ceil(%f): %f\n", 15.0001, Math.ceil(15.0001));
        System.out.printf("ceil(%f): %f\n", 15.0000, Math.ceil(15.0000));


        //floor > 내림
        System.out.printf("floor(%f): %f\n", f1, Math.floor(f1));
        System.out.printf("floor(%f): %f\n", f2, Math.floor(f2));
        System.out.printf("floor(%f): %f\n", f3, Math.floor(f3));


        //round > 반올림  int 정수 $d
        System.out.printf("round(%f): %d\n", f1, Math.round(f1));
        System.out.printf("round(%f): %d\n", 15.5, Math.round(15.5));
        System.out.printf("round(%f): %d\n", f2, Math.round(f2));
        System.out.printf("round(%f): %d\n", f3, Math.round(f3));

    }

}
