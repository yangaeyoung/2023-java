package com.green.day5.ch4;

public class FlowEx15 {
    public static void main(String[] args) {
        final int DAN = 8;

        /*
        6 x 1 = 6
        6 x 2 = 12
        6 x 3 = 18
        ...
        6 x 9 = 54
         */

        for ( int i=1; i <= 9; i++){
            System.out.printf( "%d x %d = %d\n", DAN, i, DAN * i);
        }


    }
}
