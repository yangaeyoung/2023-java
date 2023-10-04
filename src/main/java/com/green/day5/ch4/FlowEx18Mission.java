package com.green.day5.ch4;

import java.sql.SQLOutput;

public class FlowEx18Mission {
    public static void main(String[] args) {

        for(int i=1; i<10; i++){//빨리 변하는 값부터 먼저
            for(int z=2; z<10; z++){
                System.out.printf("%d X %d = %d\t", z, i, i*z);//t tap
            }
            System.out.println();
        }
    }
}
