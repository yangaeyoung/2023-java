package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {//void 메소드
        Tv tv1 = new Tv();

        Tv tv2 = tv1;//객체 tv1 하나를 만든 것이기에 tv1의 값이 tv2의 값이 됨 주소값 같음 셀로우카피

        System.out.printf("tv1.channel : %d\n", tv1.channel);

        tv1.channelUp();
        tv1.channelUp();
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        System.out.printf("tv2.channel : %d\n", tv2.channel);//셀로우 카피로 인해서 위와 같은 값이 출력됨
    }
}
