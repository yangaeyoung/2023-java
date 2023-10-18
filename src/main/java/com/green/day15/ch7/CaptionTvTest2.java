package com.green.day15.ch7;

import com.green.day14.ch6.CardDeck;

class Tv2{
    boolean power;
    int channel;
    void power() { power = !power; }
    void ChannelUp() { channel++; }// 채널에 들어있는 값은 0인데 ++되어서 1을 가지고 있음
    void channelDown() { channel--; }
}

class CaptionTv2 extends Tv2{
    int channel;//1. 이 공간에 10이 들어감
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
    void printParentChannel(){
        System.out.println("channel = " + channel);//channel앞에 super을 붙이면 부모쪽으로 올라가 갖고 있는 채널 기본값 0에 +1된 값인 1이 출력
    }
}

public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv = new CaptionTv2();
        ctv.channel = 10;
        ctv.ChannelUp();
        System.out.printf("ctv.channel : %d\n", ctv.channel);//자식의 값은 10 부모의 값은 1이 됨 자식에게 접근하여 값이 10이 찍힘
        ctv.printParentChannel();
    }
}
