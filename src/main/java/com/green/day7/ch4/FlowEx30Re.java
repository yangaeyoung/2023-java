package com.green.day7.ch4;

public class FlowEx30Re {
    public static void main(String[] args) {
        //반복문
        //

        int sum = 0;
        int i = 0;
        final int TARGET = 100;//매직 넘버: 특정한 숫자를 지정

        while(true){ //혹은 while (sum < target) sum += ++i;
            sum += ++i;
            if(sum > TARGET){break;}
        }
        System.out.println("i: "+ i);
        }
    }
