package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args) {
        int val = (int)(Math.random() * 100 ) + 1;//1~100

        if ( val % 2 == 1 ) {
            System.out.printf("%d는(은) 홀수입니다.\n", val);
        } else {
            System.out.printf("%d는(은) 짝수입니다.\n", val);
        }

        //val값이 11이면 > "11는(은) 홀수입니다."
        //val값이 12이면 > "12는(은) 짝수입니다."



        {
            // ;
            System.out.printf("%d는(은) %s입니다.\n", val, val % 2 == 0 ? "짝수" : "홀수"); //%s 문자열

        }

        String a = val % 2 == 0 ? "짝수" : "홀수";
        System.out.printf("%d는(은) %s입니다.\n", val, a);
        }


    }

