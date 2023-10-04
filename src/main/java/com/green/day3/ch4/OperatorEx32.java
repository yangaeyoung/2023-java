package com.green.day3.ch4;

import com.sun.jdi.PathSearchingVirtualMachine;

public class OperatorEx32 {
    public static void main(String[] args){
        //조건식 ? true 였을 대 : flase 였을 때;
        int n1 = 10, n2 = 20;

        int r = n1 < n2 ? n1 : n2; // n1>n2가 t였으면 n1의 값이 r로 들어갔을 것이고 f였으면 n2값이 r로 들어갔을 것
        System.out.println("r : " + r);
    }
}
