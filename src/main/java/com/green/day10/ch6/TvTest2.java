package com.green.day10.ch6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        Tv tv2 = new Tv();

        System.out.printf("tv1.channel : %d\n", tv1.channel);

        tv1.channelUp();//() Tv클래스에 있는 것을 호출
        tv1.channelUp();
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        System.out.printf("tv2.channel : %d\n", tv2.channel);
    }
}
