package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args){
        int x = 0; //0을 x에 초기화
        System.out.printf("x=%d 일 때, 참인 것은\n", x);
        //()괄호안에 트루 혹은 폴스가 될 수 있는 거 적기 = boolean 타입
        if( x == 0 ) { System.out.println(" x == 0");} //true 일 때만 실행

        if( x != 0 ) { System.out.println(" x != 0");} //거짓이기에 출력되지 않고 바로 넘어가서 아래꺼 출력됨

        System.out.println("-------------------------");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은\n", x);
        if( x == 0 ) { System.out.println(" x == 0");}
        if( x != 0 ) { System.out.println(" x != 0");}

        if( !(x == 0) ) { System.out.println(" x == 0");}
        if( !(x != 0) ) { System.out.println(" x != 0");}

        System.out.println("끝!");
    }
}
