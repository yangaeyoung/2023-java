package com.green.day3.ch4;

public class OperatorEx32Mission {
    public static void main(String[] args) {
        //절대값 만들기(기존 메소드 사용 금지)
        //만약에 n이 (음수 아무값) -10이었다면 콘솔에 10이 출력
        //만약에 n이 (양수 아무값) 9이었다면 콘솔에 9가 출력

        int n = -450;
        //n = n * -1; //음수를 양수로 변환하고자 할 때

        if (n > 0) {System.out.println("n :" + n);}//System.out.println(n)

        else {System.out.printf("n : %d" , -n);} //System.out.println(-n)

        System.out.println( n < 0 ? -n : n );

        int n2 = -89;
        if(n2 < 0){
            n2 = n2 * -1;

            System.out.println(n2);
        }



        //System.out.println("n :" + n);

        //else {
            //System.out.printf("%d은 %s수 입니다", val, val % 2 == 0 ? "짝" : "홀");}

    }
}
