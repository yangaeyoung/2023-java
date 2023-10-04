package com.green.day2.ch2;

public class Mission1 {
    public static void main(String[] args) {
        int n1 = 10, n2=3;
        float d1 = n1;
        float d2 = n2;

        //double d1 = n1;
        //double d2 = n2;
        //double r = n1 / n2; > 3.0 이 나오므로 int X   double r = (double)n1 / n2;

        //float d1 = (float)n1, d2 = (float)n2; // int는 더블 플롯으로 변함


        System.out.println( d1 / d2 );


        // n2 / n2 나누었을 때 3.333 나왔으면 한다.
    }
}
